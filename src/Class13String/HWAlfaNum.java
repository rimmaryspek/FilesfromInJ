package Class13String;

public class HWAlfaNum {
    public static void main(String[] args) {
        // Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric characters are there in the String.
        String str = "AlfaJetta1234ecotoMmyRimm&^%$";
        String str1= str.replaceAll("[^A-Za-z0-9]"," " );
        System.out.println("There are " + str1.length() + " Alphanumeric characters");
    }
}
