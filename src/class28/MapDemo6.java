package class28;

import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
        //if key contains "e" and price more than 10$ than remove

        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apple",5.0);
        items.put("keyboard",100.0);
        items.put("flower",1.0);



 /*var iterator=items.entrySet().iterator();

 while (iterator.hasNext()){
    var item=iterator.next();// gets the items
    var key=item.getKey();
    var value=item.getValue();
    if (key.contains("e") && value>10){
        iterator.remove();
    }

}
 */
        //Using Lambda
        items.entrySet().removeIf(entr->entr.getKey().contains("e")&&entr.getValue()>10);
        System.out.println(items);
    }
}
