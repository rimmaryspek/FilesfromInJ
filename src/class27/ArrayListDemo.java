package class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
       ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Aza","White","German"));
        dogs.add(new Dog("Jony","Brown","Bulldog"));
        dogs.add(new Dog("Melis","Black","Hasky"));
      //  System.out.println(dogs.toString());

       /* dogs.add(new Dog("Aza", "White", "German"));
        dogs.add(new Dog("Jony", "Black", "Bulldog"));
       dogs.add(new Dog("Melis", "Brown", "Hasky"));
        */
      //  System.out.println(dog.toString());
        System.out.println(dogs);

    }
}
