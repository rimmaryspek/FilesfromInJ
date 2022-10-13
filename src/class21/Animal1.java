package class21;

public class Animal1 {
    // overwriting
    void sleep(){
        System.out.println("Animals usually sleeps for 6 hours");
    }
void eat(){
    System.out.println("Grass and meat");
}
}
class CaT extends Animal1{

    void sleep(){
        System.out.println("i like to sleep for 20 hours");
    }
void eat(){
    System.out.println("I only like fish");
}
}
class Dog1 extends Animal1{
    void sleep(){
        System.out.println("i like to for 10 hors");
    }
void eat(){
    System.out.println("dogs like meat");
}
}
class AminlaTester1{
    public static void main(String[] args) {
      Dog1 dog1 = new Dog1();
      dog1.eat();

    }
}