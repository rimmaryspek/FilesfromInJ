package class28;

import java.util.Collection;
import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
       //remove items more than 10$ focus only for the value
        HashMap<String,Double>items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apple",5.0);
        items.put("keyboard",100.0);
        items.put("flower",1.0);
        //i want to remove the items if their price is more than 10

        //first we are getting a collection of values then an Iterator
     /*      Iterator<Double> iterator=items.values().iterator(); //first we are getting a collection of values then an Iterator
        while (iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }
        }*/

        //print only values
        Collection<Double> value=items.values();
        for (Double valeus:value// we can also use only loop
             ) {
            System.out.println(valeus);
        }

       // Iterator<Double> values=items.values(); this aprouch givis an arroe cuz ist collection
        // first we need to get collection of values than an Iterator
       items.values().removeIf(price -> price > 10);

       // System.out.println(items);
/*public boolean check(Double price){
        if (price > 10) {
            return true;
        } else {
            return false;
        }
    }*/

    }

}
