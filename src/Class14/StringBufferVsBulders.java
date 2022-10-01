package Class14;

public class StringBufferVsBulders {
    public static void main(String[] args) {
 // Mostly used class newer better faster
        StringBuilder stringBuilder =new StringBuilder("Today is java class");
        // older one slow and not use mostly
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str ="Java is very easy";
 // if we want to convert the string stringbuilder we can use the below syntax.
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);
        // Uf we want to convert from astringBuilder to A sting we can use the below syntax.
        String newStr=stringBuilder1.toString();

    }
}
