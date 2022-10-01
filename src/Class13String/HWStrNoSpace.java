package Class13String;

public class HWStrNoSpace {
    public static void main(String[] args) {
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
     String str="I am loaning java, i will love java";
    String str1= str.replaceAll(" ","");
        System.out.println(str1);


    }


}
