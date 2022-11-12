package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {

        // print all thr row's and column's from the file using loop
        //First step get the path
        String path="Data/File1.xlsx";
        // second step navigate chosen path and connected to the file
        FileInputStream fileInputStream= new FileInputStream(path);
        // third step we need to load the file, and we have chead the file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //get the sheets
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int noOfRows= sheet.getPhysicalNumberOfRows();// this method
      //  System.out.println(noOfRows); print out to know how manu rows you have
        for (int i = 0; i < noOfRows; i++) {// this loop for rows
            Row row= sheet.getRow(i);
            int noOfCell=row.getPhysicalNumberOfCells();//returns ud number of cells that contain the data
            // this loop for columns or cell
            for (int j = 0; j < noOfCell; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();// to give line after
        }

    }
}
