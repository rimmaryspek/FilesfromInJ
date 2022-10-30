package class25;

import java.util.ArrayList;

public class ArrayContainsAllMethod {
    public static void main(String[] args) {

        ArrayList<String> beatyproducks = new ArrayList<>();
        beatyproducks.add("blush");
        beatyproducks.add("concealer");
        beatyproducks.add("base");
        beatyproducks.add("maskara");
        beatyproducks.add("higtligther");
        beatyproducks.add("lipstick");

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dave soap");
        cosmetics.add("conditioner");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");

        System.out.println(beatyproducks.contains("lipstick")); // with method contains individualy
        System.out.println(beatyproducks.containsAll(cosmetics)); // with method contains individualy
        System.out.println(beatyproducks.containsAll(beatyproducks)); // with method contains individualy

    }
}
