package class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HoweWorkDublication {
  //  HomeWork for Duplications
    public static void main(String[] args) {
        List<String> alist= new ArrayList<>();
        alist.add("Rimma");
        alist.add("Aza");
        alist.add("Bella");
        alist.add("Alisha");
        alist.add("Rimma");
        HashSet<String> names= new HashSet<>(alist);
        System.out.println(names);
    }
}
