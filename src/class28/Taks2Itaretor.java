package class28;

import java.util.*;

public class Taks2Itaretor {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
       Print all keys and values from a country map using for each loop and iterator.
       Print all values from a country map using for each loop and iterator.
         */
        Map<String,String> countries= new HashMap<>();
        countries.put("Kyrgysztan","Bishkek");
        countries.put("Kazakstan","Astana");
        countries.put("Turkye","Ankara");
        countries.put("Russia","Moskow");

        Set<Map.Entry<String,String>>entrySet=countries.entrySet();
        for (Map.Entry<String,String>country:entrySet
             ) {
            System.out.println(country.getKey()+" : "+country.getValue());
        }
        for (Map.Entry m : countries.entrySet()) System.out.println(m.getKey() + ":" + m.getValue());
        Collection<String> values=countries.values();
        for (String value:values
             ) {
            System.out.println(values+" ");
        }
    }
}
