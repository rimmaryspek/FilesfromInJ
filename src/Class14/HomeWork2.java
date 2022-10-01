package Class14;

public class HomeWork2 {
    //Create a method that will take a number and prints whether the number is even or odd.
    void EorOdd(int a){
        if(a%2==0){
            System.out.println("is even number");
        }else{
            System.out.println("is odd number");
        }
    }
    public static void main(String[] args) {
        HomeWork2 hw=new HomeWork2();
    hw.EorOdd(87);
    }
}
