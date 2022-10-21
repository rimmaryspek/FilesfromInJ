package ReviewCons;

public class Banana extends Fruit{
    String origin;
    Banana(String name, String shape, String color,String origin){
        super(name,shape,color);
        this.origin=origin;
    }
void makeSmoothie(){
    System.out.println("from "+ name+" we get smothie");
}
 public void grow(){ //method overriding
    System.out.println(name+" grows fast and fresh");

}
void makePie(){
    System.out.println("banana pie is delicious");
}
  public static void havePell(){
      System.out.println(" banana is very easy to peel");
    }

    public static void main(String[] args) {
        Banana banana =new Banana("banana","banana shape","yellow","Ecuador");
        banana.haveBenefits();
        banana.makeSmoothie();
        banana.grow();
        Banana.havePell();
        System.out.println("----------------");
Fruit fruit=new Banana("banana","banan shape", " green", "africa");
        fruit.grow();
        fruit.haveBenefits();
        fruit.havePell();// static methods we can not override them it called method hiding.

    }
}
