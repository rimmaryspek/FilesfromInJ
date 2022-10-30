package class24;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
         */

        ArrayList<String> names = new ArrayList<>(5);
        names.add("Rimma");
        names.add("Aza");
        names.add("Bella");
        names.add("Alisha");
        names.add("Amir");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Aza"));
        System.out.println(names.contains("jam"));
        System.out.println(names.size());
        System.out.println(names);


    }
}
