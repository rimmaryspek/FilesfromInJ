package utils;

public class StringReviewMethods {
    public static void main(String[] args) {
        String str="hello";
        // toUpperCase or lowercase
        str.toUpperCase();
        System.out.println(str); //hello we can not change is immutable
        System.out.println("---------");
        str=str.toUpperCase(); //we initialised to str and then we can change.
        System.out.println(str);
        System.out.println("---------------");
        // length method gives us a size of string
        int size = str.length();// gives size of  this string
        System.out.println(size);
        System.out.println("-------------");
        // CharAt gives us specific index
        char letter = str.charAt(4);      //Returns the char value at the specified index
        System.out.println(letter);
        char lastCharacter =str.charAt(str.length()-1);
        System.out.println(lastCharacter); // last char is O
        // indexOf method gives location of the index
        int index = str .indexOf(letter);
        System.out.println(index);//4
        System.out.println(str.indexOf('a')); //-1
        // isEmpty method ------ checks and returns to ture if length  is more than 0.
        boolean empty =str.isEmpty();
        System.out.println(empty);

    }
}
