package class30EXCEPTION;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            String name=null;
          //  System.out.println(10/0);
        }catch (ArithmeticException a){
            System.out.println("Operation not allowed");
        }finally {
            System.out.println("This block is always executed no matter what ");
        }


    }
}
