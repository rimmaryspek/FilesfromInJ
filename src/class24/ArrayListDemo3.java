package class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        //this is how we store chars
        chars.add('a');
        chars.add('m');
        chars.add('w');
        chars.add('c');
        System.out.println(chars);
        //this is how we store booleans
        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);
        System.out.println(booleans);
        //this is how we store floats
        ArrayList<Float> floats =new ArrayList<>();
        floats.add(1.2f);
        floats.add(2.2f);
        floats.add(3.2f);
        System.out.println(floats);
    }
}
