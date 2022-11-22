package class28;

import java.util.LinkedHashMap;

public class Task1ReplaceRemoveAndSize {
    public static void main(String[] args) {
        /* Create a map of a building.
       Store floor number and its associated company name.
       (Example: 1= Google, 2=Syntax etc..).
       Insert 7 entries with duplicate keys and values.
       Check how many entries you have?
       Update company on a 4th floor.
       Remove company on the 7th floor.
       Print your map.
     */
        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"FaceBook");
        building.put(3,"Amazon");
        building.put(4,"ebay");
        building.put(5,"Syntax");
        building.put(6,"FaceBook");
        building.put(7,"Google");

        System.out.println("The number of floor on the building is " +building.size());//cheking the size
        building.replace(3,"Toyata");// replacing the pair
        building.remove(7);// removing
        System.out.println(building);// printing
    }
}
