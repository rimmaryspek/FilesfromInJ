package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    public static Properties read(String path) throws IOException {
        FileInputStream fileInputStream= new FileInputStream(path);//it hepl us navigate to the file
        var properties= new Properties();//that spesial software which helps read the data from that file
        properties.load(fileInputStream);
        return properties;
    }
}
