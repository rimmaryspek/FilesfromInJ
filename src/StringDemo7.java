import java.util.Arrays;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java programming";
        // toCharArray will convert a String to an Array of char
        char[] charArray=str.toCharArray();
            System.out.println(charArray[5]); // prints index [5] which is "e".
        System.out.println(Arrays.toString(charArray)); // prints all the characters
int counter=0;
for(char c:charArray){
    if (c=='a'){
        counter++;
    }
}
  System.out.println("letter a has app-read " + counter + " times");
    }
}
