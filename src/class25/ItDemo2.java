package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class ItDemo2 {
    public static void main(String[] args) {
        ArrayList<String> makeupItems = new ArrayList<>();
        makeupItems.add("blush");
        makeupItems.add("concealer");
        makeupItems.add("base");
        makeupItems.add("maskara");
        makeupItems.add("higtligther");
        makeupItems.add("lipstick");
        makeupItems.add("Dave soap");
        makeupItems.add("conditioner");
        makeupItems.add("shampoo");

        Iterator<String> iterator=makeupItems.iterator();// creating an iterator
        while (iterator.hasNext()){ // while loop
            String item= iterator.next(); // storing item to i.next()
            if (item.endsWith("r")){ // if condition checking is any item ends with "r"
                iterator.remove();// removing items ending with r
            }
        }
        System.out.println(makeupItems);
    }
}
