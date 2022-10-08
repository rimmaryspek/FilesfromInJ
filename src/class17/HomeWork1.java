package class17;

public class HomeWork1 {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    private int num;
    HomeWork1(){

}
public HomeWork1(int num1){
        num=num1;
}

    public static void main(String[] args) {
        HomeWork1 hw=new HomeWork1();
        HomeWork1 hw1=new HomeWork1(6);
    }

}




