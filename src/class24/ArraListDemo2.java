package class24;

import java.util.ArrayList;

public class ArraListDemo2 {
    public static void main(String[] args) {
        //to creat an array list and print out all the elemets useing 2 loops
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("---------------");
        for(Integer num:numbers){
        System.out.println(num);
    }
    }
}
