package class20;

public class MethodOverLoadingDemo {
     void F1(String name, int number){
        System.out.println("String and number");
    }
    // by changing the number of parameters
    void F1(String name, int number,int number2){
        System.out.println("name and number1 and number2");
    }
// by changing the data type position
    void F1( int number, int number2){
        System.out.println("Int number and number");
    }
    void F1(int number, String name){
        System.out.println("name and number");
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo md = new MethodOverLoadingDemo();
        md.F1("Taras",20);

    }

}
