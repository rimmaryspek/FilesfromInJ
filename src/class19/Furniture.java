package class19;

public class Furniture {
    String color="Green";

}
class Chair extends Furniture {
    String color = "Red";

    void prointColor() {
        String color = "Black";
        System.out.println(color);// prints local variables
        System.out.println(this.color);// prints the inctance variables from the same class
        //  System.out.println(super.color);

    }

    class TestChair {
        public static void main(String[] args) {
            Chair chair = new Chair();
            chair.prointColor();
        }
    }
}