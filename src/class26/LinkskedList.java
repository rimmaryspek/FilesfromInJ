package class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkskedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();//TO CHECK THE TIME OF PROSSESING THE TIMING OF COMPUTER
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(0,"test");
        }

        long endtime = System.currentTimeMillis();
        System.out.println("link" +(endtime-startTime));//TO CHECK THE TIME OF PROSSESING THE TIMING OF COMPUTER

        ArrayList<String> arrayList = new ArrayList<>();
        long startTimeAr = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(0,"test");
        }

        long endtimeAr = System.currentTimeMillis();//TO CHECK THE TIME OF PROSSESING THE TIMING OF COMPUTER

        System.out.println("arraylis"+(endtimeAr-startTimeAr));
    }
}
