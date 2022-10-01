package utils;

public class StringHW2 {
    public static void main(String[] args) {
     // Print the Sunday on reverse line
        String str="Sunday";
     for (int i=str.length()-1; i >=0; i--){
         System.out.print(str.charAt(i));
     }

     char [] charArr=str.toCharArray();
     for(int i=charArr.length-1;i>=0; i-- ){
         System.out.println(charArr[i]);
     }

    }
}
