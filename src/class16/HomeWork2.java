package class16;

public class HomeWork2 {
    //Create a method that will take a String as a parameter and returns reversed String
    //     Method should be available to all classes within your project and accessible by class name.
   public static String reverseStr(String str){
        String newstr;
        StringBuilder sb=new StringBuilder();
        sb.reverse();
        newstr= sb.toString();
        return  newstr;
       // return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
       // System.out.println(HomeWork2.reverseStr("sunday"));
    }


}
