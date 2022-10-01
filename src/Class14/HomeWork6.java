package Class14;

public class HomeWork6 {
    //Write a method to return whether given number is prime or not?
    void prime(int num){
        if((num%2==0 && num <=3)){
            System.out.println(num + " is prime number");
        }else{
            System.out.println(num + " is not prime number");
        }
    }

    public static void main(String[] args) {
        HomeWork6 num =new HomeWork6();
        num.prime(3);
    }
}
