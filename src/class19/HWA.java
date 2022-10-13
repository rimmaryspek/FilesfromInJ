package class19;

public class HWA {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
   static String printf(){
    return "Happy Weekend";
}

}
class Day extends HWA{

}
class HWATester{
    public static void main(String[] args) {
        Day min = new Day();
        System.out.println(min.printf());
    }
}