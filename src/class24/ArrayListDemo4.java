package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // creating an array list and changing the name sequence by index
        names.add("Tymur");
        names.add("Rimma");
        names.add("Salma");
        names.add("Lubo");
        names.set(2,"alisha");// we use the set method to replace the element.
        names.add(2,"josh again");

        System.out.println(names);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(1,100);

        System.out.println(num);
        num.size();
        num.toArray();
        num.clear();// it will remove all the elemts
        System.out.println(num);

    }
}
