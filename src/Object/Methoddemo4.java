package Object;

public class Methoddemo4 {
    boolean isEven(int number){
       if (number%2==0){
       return true;

    }else {
           return false;
       }
    }

    public static void main(String[] args) {
        Methoddemo4 md = new Methoddemo4();
        if (md.isEven(4)){
            System.out.println("is even");
        }else{
            System.out.println("is odd");
        }
    }

}
