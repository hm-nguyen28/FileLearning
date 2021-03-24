package FileWithObject;

import java.io.*;

public class WriteSingleObject {
  public static void main(String[] args) {
    // Tao ra 1 Student. (1 Object)
    Student student = new Student("Loc Nguyen", 21, "BNCIDEF954", 1.0);


    // TODO: Tien hanh ghi Object vao file

    // tao file neu chua co.
    File file = new File("ObjFile.DAT");

    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    // Ghi Object vao file
    try {
      // 1. Try cap vao file "file"
      FileOutputStream fos = new FileOutputStream(file);
      // 2. TODO: Write: Dua Object vao file(bayh duoc luu duoi bien fos) bang: ObjectOutputStream
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      // 3. Ghi Object vao file.
      oos.writeObject(student);
      // 4. Dong cac file lai theo LIFO (mo cuoi => dong truoc)
      oos.close();
      fos.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
