package Object;

public class Quastions {
    public static void main(String[] args) {

    // How would do reverse a string without reverse function?
    //1.use StringBuilder and reverse method
    //2.use charAt();
    String str="hello";
    String newString="";
    for (int i=str.length()-1; i>=0; i--) {

        newString=newString+str.charAt(i);

    }
    String s= "Class is over";
    StringBuilder sb=new StringBuilder(s);
    sb.reverse();
        System.out.println(sb);
    }
}
