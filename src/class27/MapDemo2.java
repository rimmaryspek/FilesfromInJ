package class27;

import java.util.LinkedHashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> beatyprodck = new LinkedHashMap<>();
        beatyprodck.put("Foudation",50.5);
        beatyprodck.put("Blush",20.0);
        beatyprodck.put("Lipstick",10.0);

        LinkedHashMap<String,Double> cosmetic = new LinkedHashMap<>();
        cosmetic.put("Soap",10.8);
        cosmetic.put("conditioner",20.8);
        cosmetic.put("Shampoo",30.8);

        LinkedHashMap<String,Double> grosery = new LinkedHashMap<>();
        grosery.putAll(beatyprodck);// putAll method prints all the element
        System.out.println(grosery);
        grosery.putAll(cosmetic);// putAll method prints all the elements from the arraylist
        System.out.println(cosmetic);
       /*
        grosery.remove(beatyprodck); Does not work for map classes
        System.out.println(grosery);
       */
        grosery.clear();//delets everyting
        System.out.println(grosery);

    }
}
