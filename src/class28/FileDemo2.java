package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //  1)we need to know path of the file, right-click the file and choose  Copy Path......
        String path = "Data/File1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);// navigate to the path
        // that special class that can hadle the XSSF files
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);
        Sheet sheet=excelFile.getSheet("Sheet1");// now inside the File1
        Row row0= sheet.getRow(0);// if i want to get first Row on the sheet
        //and, getting the data from Row 1
        System.out.println(row0.getCell(0));

        Row row1= sheet.getRow(1);
        System.out.println(row1.getCell(0));

    }
}
