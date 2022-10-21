package class23;

public class HW1Tester {
    public static void main(String[] args) {
       HW1 [] hw1s={new JavaFile(),new PdfFile(),new WordFile()};
       for(HW1 files:hw1s){
           files.open();
       }

        // HW1 file = new PdfFile();
         //  file.close();
        //   file.edit();
        //   file.open();



    }
}
