package class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 3.99);
        fruit.put("Banana", 4.99);

        System.out.println(fruit);

        System.out.println(fruit.get("Banana"));

        Set<String> keyset=fruit.keySet();// returns us all the key's(apple.....) in the farm of set

        var values=fruit.values();// gives us all the values or price

        System.out.println(keyset);

    }
}