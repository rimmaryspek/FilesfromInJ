package utils;

public class StringTrimAllmethods {
    public static void main(String[] args) {
        //trim method returns a string whose values are this string,with any leading and trailing whitespace remoted.
        String textfromApplication =" Enroll today " ;
        String textfromAUserStory ="Enroll today";
        if(textfromApplication.trim().equals(textfromAUserStory)){
            System.out.println("This is  much and passed");
        }else {
            System.out.println("enroll today");
        }
        System.out.println(textfromApplication.trim());
        System.out.println(textfromApplication);
        // Substring method
        String str ="hello class";
        String part2=str.substring(6);// how to get only "class",why 6 class starts in 6 index
        System.out.println(part2);
// hello only
        String part1=str.substring(0,5);
        System.out.println(part1);
// concat method attached's two strings together
        String newString =part1.concat(part2);
        System.out.println(newString);
        System.out.println(part1+part2);

        // some examples
        char single= newString.substring(6).charAt(0);
        System.out.println(single);// i am getting C
// newString.charAt(0).substring(6); compiler error
// +++++++++replaceAll();  method ***********
        String myString = "Today is September";
        myString= myString.replace("September","Octeber");// replaces
        System.out.println(myString);

        myString.replace("T","t");
        System.out.println(myString);
        myString.equalsIgnoreCase("today is october");//.replace()// wrong method equlaegnorecase gives us boolean ans chedks

// split() method
        String myStr="Today ia a review class";
        String[] array =myStr.split(" ");
        System.out.println(array.length); // the length is 5
        System.out.println(array[3]);// to get **review**
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);// to get all the split arrays
            // other way
            for(String arr:array){
                System.out.println(arr);
            }
        }

    }
}

