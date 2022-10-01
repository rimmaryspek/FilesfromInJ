package Class13String;

public class HWSwap {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
        String a ="chop";
        String b ="nom";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        System.out.println(b);
        System.out.println(a);

    }
}
