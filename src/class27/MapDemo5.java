package class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        Collection<Double> values =fruit.values();//to get only values and this is the method all the values of the list
        Iterator<Double> iterator=values.iterator();
        while (iterator.hasNext()){
            Double value = iterator.next();
            if(value>2){
                iterator.remove();
            }
        }

        System.out.println(fruit);
        fruit.values().removeIf(x->x>2);//lambda version same results as code 15-24

        System.out.println("----------");
        System.out.println(fruit);

    }
}