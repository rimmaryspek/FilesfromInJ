package class15;

public class HondaBike {

    static int topSpeed=200;
    static int noOfTyres=2;
    String model;
    int year;

    public void printTotalDistance(int noOfGallons, int avg){
        double distance=noOfGallons/10;
        System.out.println("your bike can go max " + distance+ " With this much " +noOfGallons);
    }

    public static void main(String[] args) {
        System.out.println(HondaBike.noOfTyres);
        HondaBike ybr=new HondaBike();
        ybr.model="ybr100";
        ybr.printTotalDistance(10,2);
    }
}
