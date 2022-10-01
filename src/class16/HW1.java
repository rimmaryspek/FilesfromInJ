package class16;

public class HW1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
     Method should be visibly only within same package and accessible by the creating an instance of the class.
    */
int  sum(int [] array){
    int sum =0;
    for (int i = 0; i < array.length; i++) {
        sum+=array[i];
    }
return sum;
}

    public static void main(String[] args) {
        HW1 math = new HW1();
        System.out.println(math.sum(new int []{5,6,7,8}));
    }
}
