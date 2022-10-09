package class18;

public class ThisKeyWordDemo {
    String str="red";
    void print(){
    String str ="blue";
        System.out.println(str);
        System.out.println(this.str);

    }
    public static void main(String[] args) {

        new ThisKeyWordDemo().print();
    }
}
