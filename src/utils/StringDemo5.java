package utils;

public class StringDemo5 {
    public static void main(String[] args) {
        String str = "Shah";
        String str1 = "Shah";
        String str2 = "Shah";
        if (str.equals("Shah")) { // checking actual content
            System.out.println("I found it");

            //if (str == str2) { works but not prefer
               // System.out.println("I found it");

            { // checking actual content
                System.out.println("I found it with equalsIgnoreCase");
            }


        }
    }
}