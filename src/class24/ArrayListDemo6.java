package class24;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();//syntax of arraylist
        // use add method to insert elemets to array list
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("black");
        System.out.println(colors);
        colors.remove("blue");// remove all only one element
        colors.remove(3);// removing by index
        System.out.println(colors);
    }
}
