package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
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
// get the iterator fron the lisk
        Iterator <String> iterator = makeupItems.iterator();
        System.out.println(makeupItems.size());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
        System.out.println(makeupItems);

    }
}
