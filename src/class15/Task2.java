package class15;

public class Task2 {
    /*
    Create a method that will take a number and prints whether the number is even or odd.
     */

    void printiEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " even");
        } else {
            System.out.println(num + " is odd");
        }

    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.printiEvenOdd(66);

    }
}