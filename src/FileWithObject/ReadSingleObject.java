package FileWithObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSingleObject {
  public static void main(String[] args) {
    // De read duoc Object tu file ra: Phai gan' cho Object trong file = 1 Object nao do.
    // Phai gan bien tham chieu bang LOP CHA cua Object can doc.
    // hier: Object la lop cha cua Student(Object can doc).
    Object obj = new Object();

    // TODO: Read Object from file.
    try {
      // 1. Truy cap vao file chua Object
      FileInputStream fis = new FileInputStream("ObjFile.DAT");
      // 2. Truy cap vao Object trong file(bayh dc luu duoi Variable fis)
      ObjectInputStream ois = new ObjectInputStream(fis);

      // 3. Doc Object
      obj  = ois.readObject();

      ois.close();
      fis.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    // Check lai
    if (obj == null) {
      System.out.println("Khong tim thay Object nao de doc!");
    } else {
      System.out.println(obj);
    }


  }
}
