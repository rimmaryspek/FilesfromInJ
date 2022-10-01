package Object;

public class MethodDemo3 {
    void printmanyTimes(int times){
        for (int i = 0;  i< times; i++) {
            System.out.println("hello java");
        }
    }
    // Parameters sequance and data type meters
 void printCustomWordmanyTimes(String word,int times){
     for (int i = 0; i < times; i++) {
         System.out.println(word);
     }
 }
    public static void main(String[] args) {
        MethodDemo3 md= new MethodDemo3();
       // md.printmanyTimes(5);
        md.printCustomWordmanyTimes("Syntax easy",3);
    }

}
