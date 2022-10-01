package class16;

public class HW2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public String name(String word) {
        StringBuilder stringBuilder =new StringBuilder(word);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        return reverse;
            }

    public static void main(String[] args) {
        HW2 nm =new HW2();
        System.out.println(nm.name("Rimma"));
    }

    }

