package ReviewCons;

public class Fruit {
protected String name;
String shape;
private String color;
public static boolean fresh;

public Fruit(String name){
    this.name=name;
}
 Fruit(String shape,String name, String color){
    this(name);
    this.shape=shape;
    this.color=color;
}
public void grow(){
    System.out.println("All fruits grow  fresh "+ fresh);
}
public static void  havePell(){
    System.out.println("All fruits nee to be peeled");
}

protected void haveBenefits(){
    System.out.println("All fruits good for your health");
}

}
