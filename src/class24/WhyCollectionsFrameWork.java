package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFrameWork {
    public static void main(String[] args) {
        /*
        if we have store a value we should use variables
         */
        String name = "Rimma";
        String name2 = "Joe";
        System.out.println(name);
        System.out.println(name2);
        /*
        If we have to srote more than 2 values of some kind or DT then we should go with Arrays
         */
        String[] names = {"Rimma", "Alish", "Aza", "Bella"};
            /*
            problems with arrays
           -- fixed size
           --
             */
       String [] breeds = new String[10];//we can use this only for arrays
       breeds[0]="bulldogs"; // this is how we store the data or value to an array
         System.out.println(Arrays.toString(breeds));// to print out all arrays

        ArrayList<String> colors=new ArrayList<>();// to store to arraylist
        colors.add("green");// this is how we store to arraylist using add keyword
        colors.add("red");
        System.out.println(colors.contains("green"));// available any method for arraylist
        System.out.println(colors);

        }
    }
