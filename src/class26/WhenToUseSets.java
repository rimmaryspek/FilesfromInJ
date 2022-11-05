package class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class WhenToUseSets {
    public static void main(String[] args) {
        // remove all duplicate numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println(new LinkedHashSet<>(numbers));// converting the integet to set

        System.out.println("hasSet");
        HashSet<Integer> hashSet = new HashSet<>(numbers);
        System.out.println(hashSet);// converting hashset

        LinkedList<Integer> linkedList = new LinkedList<>(hashSet);
        System.out.println(linkedList);
    }
}
