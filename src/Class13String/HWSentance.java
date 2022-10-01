package Class13String;

public class HWSentance {
    public static void main(String[] args) {
        // You have a String a= Is it saturday? Is it raining? Do we have a Java Class today?"
        //How would you find out how many sentences are in that String?
        String a ="Is it saturday?, is it raining?, Do we have a Java Class today?";
        String [] b =a.split("[?]");
        int sum=0;
        for(int i =0; i<b.length; i++){
            sum+=i;

        }
        System.out.println("There are " + sum + " sentences in this string");

    }
}
