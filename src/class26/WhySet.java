package class26;

import java.util.ArrayList;
import java.util.HashSet;

public class WhySet {
    //to remove the duplication we use set
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList);

        HashSet<Integer>setNums=new HashSet<>();
        setNums.add(10);
        setNums.add(20);
        setNums.add(10);
        System.out.println(setNums);
    }
}
