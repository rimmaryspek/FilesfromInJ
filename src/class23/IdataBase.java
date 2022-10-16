package class23;

public interface IdataBase {
 //  public static final int age=10; fields are static by default always stay's behind the screen
    abstract void openDatabase();
    void readData();
    void whiteData();
    void closeDatabase();
}
class IBM implements IdataBase{

    @Override
    public void openDatabase() {
        System.out.println("Opening the IBM DatBase");
    }

    @Override
    public void readData() {
        System.out.println("Reading the IBM Data base");
    }

    @Override
    public void whiteData() {
        System.out.println("Whiting the data to the database");
    }

    @Override
    public void closeDatabase() {
        System.out.println("closing the IBM database");
    }
}