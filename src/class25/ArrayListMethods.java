package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        // addAll method
        ArrayList<String> makeupItems = new ArrayList<>();
        makeupItems.add("blush");
        makeupItems.add("concealer");
        makeupItems.add("base");
        makeupItems.add("maskara");
        makeupItems.add("higtligther");
        makeupItems.add("lipstick");

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dave soap");
        cosmetics.add("conditioner");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");
// adds all makeup items to beatyproducks

        ArrayList<String> Beatyproducks=new ArrayList<>();
        Beatyproducks.addAll(makeupItems);
        Beatyproducks.addAll(cosmetics);
        System.out.println(Beatyproducks);
        Beatyproducks.remove("lotion");// remove method
        Beatyproducks.removeAll(cosmetics);//removeAll method will remove all the items from cosmetic


    }
}
