package Class14;

public class task6 {
    public static void main(String[] args) {
        ////How would you swap  2 strings without a temporary variable?
        String str1 ="word";
        String str2 ="letter";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);

    }
}
