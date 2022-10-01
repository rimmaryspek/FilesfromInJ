package Class14;

public class HomeWork1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void largestnumber(int a, int b){
        if(a>b){
            System.out.println("The largest number is "+ a);
        }else{
            System.out.println("The largest number is "+ b);
        }
    }
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    public static void main(String[] args) {
        HomeWork1 hw=new HomeWork1();
        hw.largestnumber(30,50);
    }
    }


