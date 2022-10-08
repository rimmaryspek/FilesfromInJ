package class18;

public class Horse {
    String name;
    String breed;
    int age;
    double weight;


   public Horse(String name,String breed, int age, double weight){
this.name=name;
this.breed=breed;
this.age=age;
this.weight=weight;
    }
void printonfo(){
    System.out.println("name " + name+ " breed "+ breed +" age " + age + " weight "+ weight);
}

    public static void main(String[] args) {
        Horse horseobj =new Horse("spirit", " stallion", 20,400);
        horseobj.printonfo();

    }
}
