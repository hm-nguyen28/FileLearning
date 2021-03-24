package ReadFileExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExelTabelle {
  public static void main(String[] args) throws IOException {
    // Access va Open file
    File excelFile = new File("Test1.xlsx");
    FileInputStream fis = new FileInputStream(excelFile);

    // Creating XSSF Workbook Object for Excel File (Phai tai thu vien ve roi import vao nhe!)
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    // Chon Sheet cua file Excel can doc du lieu
    XSSFSheet sheet = workbook.getSheetAt(0); // chon sheet dau tien (idx = 0)

    // We iterate on rows
    // Tao 1 List of tat ca hang (rows) roi duyet (iterate) tung hang 1.
    // TODO: sheet.iterator() : duyet (iterate) tat ca cac du lieu cua sheet.
    Iterator<Row> rowIterator =  sheet.iterator();

    while (rowIterator.hasNext()) {
      Row row = rowIterator.next();

      // Iterating on cells for the current row
      // Duyet du lieu theo tung cot(cell) cua hang(row) dang duoc duyet.
      Iterator<Cell> cellIterator = row.iterator();

      while (cellIterator.hasNext()) {
        Cell cel = cellIterator.next();

        System.out.print(cel.toString() + "\t");
      }
      // Het tung hang(row) se cach ra xuong dong
      // (d.h Duyet het cac cot(cell) cua 1 hang)
      System.out.println();
      System.out.println();
    }
    workbook.close();
    fis.close();
  }
}
