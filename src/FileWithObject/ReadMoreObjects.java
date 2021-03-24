package FileWithObject;

import java.io.*;

public class ReadMoreObjects {
  public static void main(String[] args) { // co the throws hoac dung try-catch
    // Creating a Object of the class of the Object, which supposed to be read, in order to save
    // and then read it. (The Father-Class is also working)
    // With the Student class => phai ep kieu.

    // Accessing the file of the Objects
    try {
      FileInputStream fis = new FileInputStream("MoreObj.DAT");
      // Accessing the Object
      ObjectInputStream ois = new ObjectInputStream(fis);

      // TODO: Read the Objects. First: Check if there are still any Objects in the file.
      while (fis.available() > 0) {
        Object objStudent = ois.readObject();
        // In Object ra
        System.out.println(objStudent);
      }

      // TODO: DOnt forget to close the file and Object.
      ois.close();
      fis.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    // TODO: Read an Array from File?
//    try {
//      FileInputStream fis1 = new FileInputStream("MoreObj1.DAT");
//      ObjectInputStream ois1 = new ObjectInputStream(fis1);
//      while (fis1.available() > 0) {
//        Object obj1 = ois1.readObject();
//        System.out.println(obj1);
//      }
//
//      ois1.close();
//      fis1.close();
//
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//    }


  }
}
