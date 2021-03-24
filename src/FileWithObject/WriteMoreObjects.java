package FileWithObject;

import java.io.*;

public class WriteMoreObjects {
  public static void main(String[] args) throws IOException { // co the throws hoac dung try-catch
    // IOException (In-output) la lop cha cua tat ca cac Exceptions lien quan
    // => Throws IOException thi ko can throws FileNotFound... nua.

    // Initialization the Students
    Student student = new Student("Loc Nguyen", 21, "BNCIDEF954", 1.0);
    Student student1 = new Student("Tran Tran", 22, "DKJLDSJ699", 1.3);
    Student student2 = new Student("Max", 24, "JLDKJL786", 2.0);


    // TODO: Write in File
    File file = new File("MoreObj.DAT");
    // Create a file named "MoreObj.DAT" if the file does not exists
    if (!file.exists()) {
      file.createNewFile();
    }

    // Accesing the File
    FileOutputStream fos = new FileOutputStream(file);
    // Putting the Object into the file
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    // Write!
    oos.writeObject(student);
    oos.writeObject(student1);
    oos.writeObject(student2);

    // Close file and Object with the reversed direction of opening them
    oos.close();
    fos.close();

//    // TODO: Write an Array into File?
//    Student[] students = new Student[3];
//    students[0] = student;
//    students[1] = student1;
//    students[2] = student2;
//
//    File file1 = new File("MoreObj1.DAT");
//    // Create a file named "MoreObj.DAT" if the file does not exists
//    if (!file1.exists()) {
//      file1 .createNewFile();
//    }
//    FileOutputStream fos1 = new FileOutputStream(file1);
//    ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
//
//    oos1.writeObject(students);
//
//    oos1.close();
//    fos1.close();
  }
}
