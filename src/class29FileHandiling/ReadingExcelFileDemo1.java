package class29FileHandiling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {
        String path="Data/File1.xlsx";// Getting the path or location form HD that you stared your file. And this path is very sensitive.
        FileInputStream fis=new FileInputStream(path);// navigate to the file
        XSSFWorkbook excel= new XSSFWorkbook(fis);//convirting 001's(row bytes) to data (excel format)that we can read and understand.
        Sheet sheet=excel.getSheet("Sheet1");// and, sheting acsses to a sheet
        int noOfRow= sheet.getPhysicalNumberOfRows();// getting number of row's
        for (int i = 0; i < noOfRow; i++) { //ou
            Row row=sheet.getRow(i);
            int noOfCell=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfCell ; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }







    }
}
