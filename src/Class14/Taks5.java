package Class14;

public class Taks5 {
    public static void main(String[] args) {
        // check this is palindrome
        String str = "dad";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("The String is palindrome");

        }else{
            System.out.println("The String is not palindrome");
        }
    }
}