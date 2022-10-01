package Class13String;

public class HWReverse {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example input=> This is sentence I want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever.
        String str="I love my family";
        System.out.println(str);
        String[] arr=str.split(" ");
        for(int i=0; i< arr.length; i++){
            for (int j = arr[i].length()-1; j>=0; j-- ){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }

    }
}
