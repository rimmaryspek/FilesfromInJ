public class StringDemo9 {
    public static void main(String[] args) {
        String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
        /*
         replace method replace one String with another is a String
         replaceAll it take a pattern and replace all the characters that follow that pattern
        */
        System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[a-z]", ""));

    }
}
