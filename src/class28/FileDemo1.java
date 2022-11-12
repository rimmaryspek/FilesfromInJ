package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //rigth click the file and copy path reference and click from content root
        String path="Data/config.proporties";// the lacation of the file
        FileInputStream fileInputStream= new FileInputStream(path);//it hepl us navigate to the file
        var properties= new Properties();//that spesial software which helps read the data from that file
        properties.load(fileInputStream);//load all thr data from the file inside(memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("passWord"));
        fileInputStream.close();// closes file



    }
}
