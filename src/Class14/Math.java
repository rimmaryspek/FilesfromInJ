package Class14;

public class Math {
    void add (int number1, int number2){
        System.out.println(number1+number2);
    }
    void printFiboSeries(int size){

        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0; i<size;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;
        }
    }

    public static void main(String[] args) {
        Math obj=new Math(); // Creating an object of the Math class
        obj.printFiboSeries(5);// this is how we execute the logic present insede the mrthod ar calling a method
        System.out.println("****************");
        obj.printFiboSeries(10);

        obj.add(10,20);
    }
}
