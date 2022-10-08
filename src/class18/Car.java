package class18;
 public class Car {
     // common class has many names different like parent class, super class, base class.
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    // if a field or method has private access modifier in parent class child class can not use
    private String engineType;
     void printDetails(){
         System.out.println("model " + model +" make " + make + " color "+ color);
     }
}
 class BMW extends Car{
     // child class or derive class or subclass
double engineCC;

}

class Tesla extends Car {

}
class Toyota extends Car{
    double engineCC;
}

class Tester{
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.model="X5M";
        bmw.make="BMW";
        bmw.color="Black";
        bmw.printDetails();
        bmw.engineCC=500;

    }
}