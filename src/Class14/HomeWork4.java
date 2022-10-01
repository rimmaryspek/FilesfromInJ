package Class14;

public class HomeWork4 {
    //Create a method that will say Hello in different language based on the country that will be passed when method is executed
void hello(String word){
    switch (word){
        case "USA":
            System.out.println("Hello");
            break;
        case "Russia":
            System.out.println("Privet");
            break;
        case "France":
            System.out.println("Bonjour");
            break;
        case "Mexico":
            System.out.println("Hola");
            break;
        default:
            System.out.println("Invalid a valid country");
    }
}
    public static void main(String[] args) {
        HomeWork4 hey =new HomeWork4();
        hey.hello("USA");
    }

}
