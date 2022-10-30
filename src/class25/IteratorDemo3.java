package class25;

import java.util.ArrayList;

public class IteratorDemo3 {
    public static void main(String[] args) {
        // delete all the items statrts with B ends with a
        ArrayList<String> makeupItems = new ArrayList<>();
        makeupItems.add("Blush");
        makeupItems.add("concealer");
        makeupItems.add("Base");
        makeupItems.add("maskara");
        makeupItems.add("higtligther");
        makeupItems.add("lipstick");
        makeupItems.add("Dave soap");
/*
          var number=10;
         var name="Tymur";
         var decimalNumber=21.5;
          */
        var iterator = makeupItems.iterator();

        while (iterator.hasNext()){
            // var item=iterator.next(); java 11
            String item=iterator.next();
            if(item.startsWith("B")||item.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(makeupItems);
    }
}
