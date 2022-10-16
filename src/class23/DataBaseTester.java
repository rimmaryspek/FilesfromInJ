package class23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase =new Oracle();//MicroSoftdataBase also can here to get first method and Oracle is the second method.
        dataBase.readData();
        dataBase.whiteData();
        dataBase.openDatabase();
        dataBase.closeDatabase();
    }
}
