package class23;

public class InterfaceTester {
    public static void main(String[] args) {
        IdataBase idataBase = new IBM();
        idataBase.openDatabase();
        idataBase.readData();
        idataBase.whiteData();
        idataBase.closeDatabase();
    }
}
