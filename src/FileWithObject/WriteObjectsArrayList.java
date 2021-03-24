package FileWithObject;

import java.io.*;
import java.util.ArrayList;

public class WriteObjectsArrayList {
  public static void main(String[] args) {
    // Initialization the Students
    Student student = new Student("Loc Nguyen", 21, "BNCIDEF954", 1.0);
    Student student1 = new Student("Tran Tran", 22, "DKJLDSJ699", 1.3);
    Student student2 = new Student("Max", 24, "JLDKJL786", 2.0);

    // TODO: Creating an ArrayList to save all the Objekts.
    ArrayList<Student> students = new ArrayList<>();
    students.add(student);
    students.add(student2);
    students.add(student1);

    // Creating a file to put the Objects in.
    File file = new File("ObjArrList.DAT");

    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    // TODO: Accessing the file and Write the ArrayList into the file.
    try {
      // 1. Accessing the file
      FileOutputStream fos = new FileOutputStream(file);
      // 2. Accessing the ArrayList of Objects
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // 3. Write the ArrayList of Objects into the file
      oos.writeObject(students);

      // 4. Close the file and Objects
      oos.close();
      fos.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
