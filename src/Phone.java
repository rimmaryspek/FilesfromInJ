public class Phone {

    //Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
    String make;
    String model;
    String color;
    int year;
    int storage;

    void makeCall() {
        System.out.println("making call using and than " + model);
    }

    void takeNotes() {
        System.out.println("taking nones with " + model);
    }

    void browseInternet() {
        System.out.println("Browsing in the internet using " + model);
    }

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.model = "IPHONE 14";
        iphone .make= "Apple";
        iphone. year=2022;
        iphone.makeCall();
    }
}