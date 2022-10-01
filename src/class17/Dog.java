package class17;

public class Dog {
    private String name;
   private String breed;
   private String color;
    private int age;
   private String weight;

    Dog(String dogname, String dogbreed, String dogcolor, int dogage, double dogweight){
        name=dogname;
        breed=dogbreed;
        color=dogcolor;
        if(dogage>30){
            System.out.println("please enter value");
        }else {
            age = dogage;
        }

    }
    void printinfo(){
        System.out.println("name " + breed + age);
    }

    public static void main(String[] args) {
       // Dog dog =new Dog(); this is object better use contraction
        //dog.name="tommy";
       // dog.breed="husky";
      //  dog.color="pink";
      //  dog.age=2;
        Dog dog= new Dog("tomy","husky","pink",10,30);
        dog.printinfo();


       // Dog dog2 =new Dog();
      //  dog2.name="gumy";
      //  dog2.breed="german";
     //   dog2.color="blue";
     //   dog2.age=2;
      //  dog2.printinfo();

    }

}
