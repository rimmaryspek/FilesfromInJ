package Class13String;

public class StringReview1 {
    public static void main(String[] args) {
        String str ="today is Sunday";
        String day= str.substring(9);
        System.out.println(day);
        System.out.println(str.substring(6,8));
        char c=str.charAt(4);
        // to get the exact letter
        System.out.println(str.charAt(4));// calling the method charAt on str object.

    }

}
