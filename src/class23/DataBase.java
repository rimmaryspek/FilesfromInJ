package class23;

public  abstract class DataBase {
    abstract void openDatabase();
    abstract  void readData();
    abstract void whiteData();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("opening the Microsoft database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data");
    }

    @Override
    void whiteData() {
        System.out.println("writing thr the data to MS");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the MSDatabase");
    }
}
 class Oracle extends DataBase{

     @Override
     void openDatabase() {
         System.out.println("opening");
     }

     @Override
     void readData() {
         System.out.println("reading");
     }

     @Override
     void whiteData() {
         System.out.println("writing");
     }

     @Override
     void closeDatabase() {
         System.out.println("closing");
     }
 }
