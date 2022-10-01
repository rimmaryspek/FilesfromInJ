package Class14;

public class task3 {
    public static void main(String[] args) {
      // you have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
       // How would you find out how many sentences are in that String
       // String a= ”Is it saturday? Is it raining? Do we have a Java Class today?”;
             //  String[] sentances =a.split("[]")




        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */

 String str ="This is sentence i want to reverse";
 String [] arr=str.split(" ");
 StringBuilder st=new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            String word=arr[i];
            StringBuilder stringBuilder= new StringBuilder(word);
            stringBuilder.reverse();
            arr[i]=stringBuilder.toString();
            st.append(arr[i]).append(" ");
        }
        System.out.println(st);


    }
}
