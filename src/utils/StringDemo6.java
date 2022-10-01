package utils;

public class StringDemo6 {
    public static void main(String[] args) {
        String str="I love java programming";
        //charAt returs us the character at the specific index

            System.out.println(str.charAt(2));
            for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));// all the characters including spaces
       if(!(str.charAt(i)==' ')){ // to ignore the spaces
           System.out.println(str.charAt(i));//
       }
        }

    }
}
