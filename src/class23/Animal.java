package class23;

public  abstract class Animal {
     abstract void eat();
     abstract void sleep();
}
class Cat extends Animal{
     @Override
     void eat() {
          System.out.println("Cats like sleep");
     }

     @Override
     void sleep() {
          System.out.println("Cats can slee 18-28 housr");
     }
}
class Dog extends Animal{
     @Override
     void eat() {
          System.out.println("cat like wotermelon");
     }

     @Override
     void sleep() {
          System.out.println("cat can sleep 24 hours");
     }
}