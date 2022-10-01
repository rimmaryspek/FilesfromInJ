package Class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {

        String str ="GAffsjdjdhfgfgg122534%$#@";// keep only lower case letters
        str=str.replaceAll("[^a-zA-Z]","");//adding upper case
        System.out.println("str = " + str);

        String sentence= "Batch 14 is great. batch 14 is excellent! Batch 14 is just amazing.";// split method
        String[] split = sentence.split("[.!]");
        System.out.println("split=" + Arrays.toString(split));

        String str2 ="Batch 14 is great.Batch 14 is great";
        String replace = str2.replaceFirst("great", "good");// changing only word "great" to "good"
        System.out.println(replace);


    }

    }


