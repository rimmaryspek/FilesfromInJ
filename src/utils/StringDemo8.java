package utils;

public class StringDemo8 {
    public static void main(String[] args) {
 String str="I am always consfused i was kidding"; // if we need to find the index of the output.
 System.out.println(str.indexOf("a"));
 System.out.println(str.indexOf("s"));
 System.out.println(str.indexOf(" "));
 System.out.println(str.substring(5));
        System.out.println(str.substring(5,11));
        // substring () gives you smaller string from a String we can the starting part
        // to the method it will return us the subString from that index.
int num=1212121231;
String numStr =String.valueOf(num).substring(1,3);
System.out.println(numStr);
num=Integer.parseInt(numStr);
System.out.println(num); //how we can get index




    }
}
