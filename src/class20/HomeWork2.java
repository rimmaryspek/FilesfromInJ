package class20;

public class HomeWork2 {
    //Create a class named 'Programming'.
    // While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.


    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

public HomeWork2 (){
    System.out.println("I love programming ");
}

    public HomeWork2 (String word){
        System.out.println("I love " + word);
    }

    public static void main(String[] args) {
        HomeWork2 run = new HomeWork2();
        HomeWork2 run2 = new HomeWork2("Java");

    }

}
