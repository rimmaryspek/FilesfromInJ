public class StringDemo4 {
    public static void main(String [] args){
        String str="i love java";
        System.out.println(str);
// remove the space before after String but not the ones are present in between
        System.out.println(str.trim());
    String str1= "java is very easy";
    System.out.println(str1.startsWith("Java"));// starts with specific letter or Java
        System.out.println(str1.endsWith("y"));// ends with  specific letter or wordY
        System.out.println(str1.contains("very"));// contains specific in between words or letter
        System.out.println(str1.toLowerCase().contains ("very")); //Method changing helps us to print all in one line

    }
}
