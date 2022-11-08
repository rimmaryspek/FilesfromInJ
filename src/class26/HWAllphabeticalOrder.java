package class26;

import java.util.TreeSet;

public class HWAllphabeticalOrder {
    public static void main(String[] args) {
        //print the contries as per alphabetical order
        TreeSet<String> countries= new TreeSet<>();
        countries.add("Bishkek");
        countries.add("Moscow");
        countries.add("New York");
        countries.add("Orlando");
        countries.add("Maimi");
        System.out.println("************");
        for (var country:countries){
            System.out.println(country+"  ");
        }
    }
}
