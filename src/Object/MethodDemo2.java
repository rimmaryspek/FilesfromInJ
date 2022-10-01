package Object;

public class MethodDemo2 {
   // Methods that does not take any parameters and prints are lines at the console
    void printHello(){
        System.out.println("hello wold");
        System.out.println("hello java");
    }
    // a method that takes a single parameters of type String and prints in
void printword(String word){

        System.out.println(word);
}
    public static void main(String[] args) {
        MethodDemo2 obj = new MethodDemo2();
        obj.printHello();
    }
}
