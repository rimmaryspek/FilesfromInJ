package class29FileHandiling;

import utils.configReader;

import java.io.IOException;

public class FilesDemoConfig {
    public static void main(String[] args) throws IOException {
        String path ="Data/config.proporties";
        var propreties= configReader.read(path);
        System.out.println(propreties.getProperty("browser"));

        String excelPath="Data/File1.xlsx";
        var excelData=ExcelReader.read(excelPath);
        System.out.println(excelData);

    }
}
