package class15;

public class task3 {
//Create a method that will print whether given String is palindrome or not./

 void palindrome(String str){

  StringBuilder stringBuilder = new StringBuilder(str);
  stringBuilder.reverse();
  if (stringBuilder.toString().equals(str)) {
   System.out.println("The String is palindrome");

  }else{
   System.out.println("The String is not palindrome");
  }
 }

 public static void main(String[] args) {

  task3 taks =new task3();
  taks.palindrome("dad");
  taks.palindrome("thor");

 }

}
