package FileWithObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjectsArrayList {
  public static void main(String[] args) {
    try {
      // 1. Accessing the File
      FileInputStream fis = new FileInputStream("ObjArrList.DAT");
      // 2. Accessing the Object (ArrayList of Objects)
      ObjectInputStream ois = new ObjectInputStream(fis);
      // 3. TODO: Read the Objects in the file

      // Tao ra 1 ArrayList khac de gan ArrayList( of Objects) trong file vao.
      // Luu y: Phai ep kieu. Vi kieu tra ve (cua ois.readObject()) khac voi kieu minh gan.
      ArrayList<Student> objStudents = (ArrayList<Student>) ois.readObject();

      // In ra ArrayList
      for (Student x : objStudents) {
        System.out.println(x);
      }

      // 4. Close the stream
      ois.close();
      fis.close();

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
