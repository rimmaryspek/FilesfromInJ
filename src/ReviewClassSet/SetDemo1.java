package ReviewClassSet;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //how can i get the higesth number and remove duplicatinons
        //we want to sort and remove duplicates from an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1000000);
        numbers.add(2000000);
        numbers.add(300000);
        numbers.add(40000);
        numbers.add(5000);
        numbers.add(5000);
        Set<Integer> set=new TreeSet<>(numbers);// converting the Arraylist to a TreeSet
        /*numbers.clear();// cleaning the dublications
        //numbers.addAll(set);//storing back to the arraylist
        */System.out.println(numbers);
        //Second way to got uoptup
        ArrayList<Integer> numbers2=new ArrayList<>(set);

        System.out.println(numbers2);
    }
}
