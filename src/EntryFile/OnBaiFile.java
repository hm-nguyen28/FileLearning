package EntryFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class OnBaiFile {
  public static void main(String[] args) throws IOException {
    // Nhap du lieu vao tu ban phim bang 2 cach:
    // Cach 1 dung Scanner.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hay nhap du lieu vao!");
    String x = scanner.nextLine();
    System.out.println("Du lieu vua nhap la: " + x);

    System.out.println("Do it continually!");
    // Cach 2 dung DataInputStream
    File file = new File("NewText.txt");
    if (!file.exists()) {
      file.createNewFile();
    }

    // Ghi du lieu vao file:
    FileOutputStream fos = new FileOutputStream(file);
    String s = "Hey soul sister. This is a message \n 12 1212 3223 434 1212 44 889 99";
    fos.write(s.getBytes());

    // Doc du lieu tu file ra
//    FileInputStream fis = new FileInputStream(file);
//    char[] chars = new char[100];
//    for (int i = 0; i < chars.length; i++) {
//      chars[i] = (char) fis.read();
//    }
//    for (char a : chars) {
//      System.out.println(a);
//    }
    // cach 2 voi Scanner:
    Scanner scanner1 = new Scanner(file);
    if (scanner1.hasNextLine()) {
      String text = scanner1.nextLine();
      System.out.println(text);
    }
    scanner.close();
    scanner1.close();
  }
}
