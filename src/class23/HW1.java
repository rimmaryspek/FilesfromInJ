package class23;

public abstract class HW1 {
    //Create a class File that will have the following behaviors: open, edit, close.
    // Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
    abstract void open();

    void edit(){
        System.out.println("editing the file");
    }

void close(){
    System.out.println("closing the file");
}
}
 class JavaFile extends HW1{

     @Override
     void open() {
         System.out.println("Doc file we need Microsoft word to be installed etc");
     }
 }
 class WordFile extends HW1{

     @Override
     void open() {
         System.out.println("java file we need notepad++ or sublime text");
     }
 }
 class PdfFile extends HW1{

     @Override
     void open() {
         System.out.println("to open .doc file we need Microsoft word to be installed etc");
     }
 }