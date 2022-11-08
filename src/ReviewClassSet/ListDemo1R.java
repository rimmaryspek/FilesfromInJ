package ReviewClassSet;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo1R {
    public static void main(String[] args) {
        ArrayList<String> animals= new ArrayList<>();
        animals.add("Dog");// when we us e the simple add method that takes ane parameter elements are the added at the end of the list.
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("panda");
        animals.add("Horse"); // if we need to simple print out all the emelent just sout
        System.out.println(animals);
        // how to print size of the size of each work from this list?
        // for the loor enhenced we can use shortcut and just type ITER and hit enter
        for (String animal : animals) {
            System.out.println(animal.length());// coming from String class
        }
        // how can we revome which have more than 5 letter using lambda method or Iterator
        // animals.removeIf(x->x.length()>4);
        System.out.println(animals);
        // if element is more than 4 letters we want to replace that with Camel
        // why we should not use the iterator, cuz we are not performing any operatoin that can change the size of the list
        // we should not use the enhanced lood here as we are not printing the data we are updating the data
        // as we need the index to update we should use simple for loop.
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).length()>4){
                animals.set(i,"camel");// set method replaces the elements
            }
        }
        System.out.println(animals);
        animals.subList(0,3);
        System.out.println(animals.subList(0,3));// gives us only 3 element like 0,1,2 short list

        ListIterator<String> stringListIterator = animals.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

    }

}
