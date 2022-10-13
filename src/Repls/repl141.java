package Repls;

public class repl141 {
    //Create the maxValue method that will accept int array and return return the maximum value in the array.
    //
    //
    //Method should visible every class in any package!
    //
    //
    //**Expected Output:**
    //
    //```
    //22
    //```
    public static int maxValue( int [] value){
        int mac=0;
        for(int i=0; i<value.length; i++){
            if(value[i]>mac){
                mac=value[i];
            }
        }
        return mac;
    }


    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }


}

