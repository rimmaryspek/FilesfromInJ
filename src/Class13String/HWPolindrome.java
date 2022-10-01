package Class13String;

public class HWPolindrome {
    public static void main(String[] args) {
       //How would you check if String is palindrome or not? aba=> true Abbc =>false
        String a= "amma"; // if is rimma then it's not polindrome.
        char[]  b=a.toCharArray();
        String c = "";
        for (int i=b.length-1; i>=0; i--){
            c+=b[i];

        }
        System.out.println(c.equals(a));
    }
}
