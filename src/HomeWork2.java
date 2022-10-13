public class HomeWork2 {
    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    public static void main(String[] args) {
        Book headfirstJava = new Book("Headfirstjava", "kathy", 12, 13334);
        Book dataStructor = new Book("Headfirstjava", "kathy", 12);
    }

}
class Book {
    String name;
    String author;
    int noOfTotalCh;
    int ISBN;

    public Book(String name, String author, int noOfTotalCh, int ISBN) {
        //this.name=name;
        //this.author=author;
        // this.noOfTotalCh=noOfTotalCh;
        // this.ISBN=ISBN;
        this(name, author, noOfTotalCh);
        this.ISBN = ISBN;
    }

    public Book(String name, String author, int noOfTotalCh) {
        this.name = name;
        this.author = author;
        this.noOfTotalCh = noOfTotalCh;

    }
}

