package ReviewClass12;

import java.util.HashMap;
import java.util.Map;

public class InterviwQuestion {
    public static void main(String[] args) {
        //Creat amethod that return a of map of characters and their count in a String

        String str ="gsgsggsfsfsd cb sddsf";
        //1 step convert String to an Array to Cotacters
        System.out.println(getcount(str));
    }
    public static Map<Character, Integer> getcount(String str){
        char[] charr=str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char s:charr){
if (map.get(s)==null){
    map.put(s,1);
}else {
    int count=map.get(s);
    count=count+1;
    map.put(s,count);
}
        }
        return map;
    }
}
