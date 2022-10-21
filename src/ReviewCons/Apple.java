package ReviewCons;

public class Apple extends Fruit{
    String size;
    String taste;
    double price;

    Apple(String name, String shape, String color, String size){
        super(name,shape,color);
        this.size=size;
    }
Apple(String name, String shape, String color, String taste,double price){
       super(name, shape, color);
       this.taste=taste;
       this.price=price;
}
void makeJuice(){
    System.out.println("from "+ name+ " we can make "+taste+" juice");
}

void makeJuice(String fruit){
    System.out.println("we can have juice from " +name+ " mixed with " + fruit);
}

public static void main(String[] args) {
        Apple app = new Apple("apple","circle","red","big");
       // app.color; not visible since it is private access
    System.out.println(app.name);
    System.out.println(app.shape);

    System.out.println(Fruit.fresh);
    System.out.println(Apple.fresh);

    app.grow();
    app.haveBenefits();
    app.makeJuice();
    }
}
