package Class14;

public class HomeWork3 {
//Create a method that will print whether given String is palindrome or not.

void palindrome(String word){
    StringBuilder st = new StringBuilder(word).reverse();
String str= st.toString();
if (word.equals(str)){
    System.out.println("The String is palindrome");
}else{
    System.out.println("The String is not palindrome");
}
}
    public static void main(String[] args) {
        HomeWork3 obj=new HomeWork3();
        obj.palindrome("noon");
    }
}




