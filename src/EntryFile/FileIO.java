package EntryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author LocD.Nguyen
 */
public class FileIO {
  public static void main(String[] args) throws IOException {
//    File file = new File("test.txt");

//    // Ktra xem file "file" co ton tai hay ko.
//    if (file.isFile()) {
//      System.out.println("File \"file\" co ton tai." + "XPath:" + file.getAbsolutePath());
//    } else {
//      System.out.println("File not found.");
//    }

    File file = new File("NewFile.txt");
    // Tao file moi neu file khong ton tai.
    if (!file.exists()) {
      file.createNewFile();
    }

    // Ghi thong tin vao file
    FileOutputStream fos = new FileOutputStream(file);
    String s = "Hello World from File input in Java";

    fos.write(s.getBytes());
    fos.close();

    // Doc thong tin tu file
//    FileInputStream fis = new FileInputStream(file);
//    int a = fis.read();
//    while (a != -1) {
//      System.out.println((char) a);
//      a = fis.read();
//    }
//    fis.close();
    Scanner scanner = new Scanner(file);
    String text = scanner.nextLine();
    System.out.println(text);
  }
}
