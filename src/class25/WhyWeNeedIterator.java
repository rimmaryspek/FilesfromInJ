package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class WhyWeNeedIterator {
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
      /*  for (int i = 0; i < makeupItems.size(); i++) { never use loop for an array list or collection framework,
      cuz it will change the size
            if (makeupItems.get(i).endsWith("r")) {
                makeupItems.remove(i);
            }
        }

       */

        Iterator<String> iterator=makeupItems.iterator();

        while (iterator.hasNext()){
            //  String item= iterator.next(); //better approach
            if(iterator.next().endsWith("r")){
                iterator.remove();
            }
        }

        System.out.println(makeupItems);
    }
}