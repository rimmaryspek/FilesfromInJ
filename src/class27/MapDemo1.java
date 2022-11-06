package class27;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit = new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",3.99);
        System.out.println(fruit);

        System.out.println(fruit.get("Orange"));// only getting Orange and it will show oly price
        fruit.remove("Mango");// removes Mango
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Apple"));//serching Apple in the aaraylist
        System.out.println(fruit.containsKey("Kiwi"));// to check if is kiwi contains on the arraylist
      //to check value or price
        System.out.println(fruit.containsValue(4.99));
        System.out.println(fruit.isEmpty());//checking is list Empty or not
        fruit.replace("Apple",6.00);//replace the price
        System.out.println(fruit);
    }
}
