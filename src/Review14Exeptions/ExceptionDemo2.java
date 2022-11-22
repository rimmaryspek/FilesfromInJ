package Review14Exeptions;

import class29FileHandiling.ExcelReader;

import java.io.IOException;

public class ExceptionDemo2 {
    public static void main(String[] args)  {

        try{
            ExcelReader.read("dkjbfkjdbf");}
        catch (IOException e){
            System.out.println("Please contact our support team at support@syntax.com");
        }

    }
}
