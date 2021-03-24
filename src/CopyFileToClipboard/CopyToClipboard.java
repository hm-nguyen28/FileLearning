package CopyFileToClipboard;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import javax.sound.sampled.Clip;

public class CopyToClipboard {
  public static void main(String[] args) throws IOException {
//    String str = "This String is copied to clipboard from Java!";
//
//    Toolkit toolkit = Toolkit.getDefaultToolkit();
//    Clipboard clipboard = toolkit.getSystemClipboard();
//    StringSelection strSel = new StringSelection(str);
//    clipboard.setContents(strSel, null);
//
    // File file = new File("Copy.FILE");

//    if (!file.exists()) {
//      try {
//        file.createNewFile();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }

    InputStream inStream = null;
    OutputStream outStream = null;

    try {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Clipboard clipboard = toolkit.getSystemClipboard();
//      StringSelection stringSelection = new StringSelection(strFile);
//      clipboard.setContents(stringSelection, null);
      File file = new File("Copy.FILE");

      inStream = new FileInputStream(file);
      

      int length;
      byte[] buffer = new byte[1024];

      // copy the file content in bytes
      while ((length = inStream.read(buffer)) > 0) {
        outStream.write(buffer, 0, length);
      }
      System.out.println("File is copied successful!");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      inStream.close();
      outStream.close();
    }




//    try {
//      FileInputStream fis = new FileInputStream(file);
//      System.out.println(fis.available());
//
//      int[] integer = new int[fis.available()];
//      for (int i = 0; i < integer.length; i++) {
//        integer[i] = fis.read();
//      }
//
//      String[] strIteger = integer.;
//      System.out.println(strIteger);
//
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//
//    String strFile = file.toString();
//
//    Toolkit toolkit = Toolkit.getDefaultToolkit();
//    Clipboard clipboard = toolkit.getSystemClipboard();
//    StringSelection stringSelection = new StringSelection(strFile);
//    clipboard.setContents(stringSelection, null);



  }

}
