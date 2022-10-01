package class15;

public class Task6 {
    //Write a method to return whether given number
    //is prime or not?

    boolean isPrime(int number) {
        boolean isPrime = true;
        if (number < 1) {
            for (int i = 0; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        } else {
            return false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Task6 task6=new Task6();
        System.out.println(task6.isPrime(12));

    }
}
