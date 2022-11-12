package class28;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {
       //getting keys and values together
        // var lastname; does not work with instance variables as java can't figure out the data type as there are no values
        // assigned
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apple",5.0);
        items.put("keyboard",100.0);
        items.put("flower",1.0);

       // Set<Map .Entry<String,Double>> entrySet= items.entrySet(); longer way instead we can use ---> VAR
        var entrySet=items.entrySet();
       // var dog= new Dog();
        //var number=10.2 comes automotically and VAR doent work wint instance variable

        System.out.println(entrySet);

        for (var item :entrySet
             ) {
            System.out.println(item.getKey()+" " +item.getValue());
        }

    }
}
