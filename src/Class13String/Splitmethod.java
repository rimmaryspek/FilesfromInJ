package Class13String;

import java.util.Arrays;

public class Splitmethod {
    public static void main(String[] args) {
        // Separate all the words by index
        String str ="Batch 12 is really good";
        String [] arr =str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);
// separate the sentences
String str2="today is sunday.Sunday is good.Java is also good";
// individual character use [.]. if you what to change to , use [,].
String [] arr2=str2.split("[.]");
System.out.println(Arrays.toString(arr2));



    }
}
