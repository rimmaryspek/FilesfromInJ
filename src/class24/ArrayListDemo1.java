package class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();//syntax of arraylist
        // use add method to insert elemets to array list
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("black");
        // to print all elemets
        System.out.println(colors);
        // get method to print individual  elements from array list
        System.out.println(colors.get(3));
        System.out.println(colors.get(2));
        System.out.println(colors.size());// to get size

        for (int i = 0; i < colors.size(); i++) {// using for loop
            System.out.println(colors.get(i));
        }
        System.out.println("--------------");
        for(String color:colors){ // enchandsloop
            System.out.println(color);
        }

    }
}
