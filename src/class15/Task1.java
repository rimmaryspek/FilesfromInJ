package class15;

import java.util.Scanner;

public class Task1 {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger./
     */

void printlarger(int num1 , int num2){
    if (num1>num2){
        System.out.println("numer one is" + num1);
    } else if (num2>num1) {
        System.out.println("number two is large " + num2);
    }else {
        System.out.println("Number is equal");
    }
}
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);//adding scanner
        System.out.println("please enter a number ");//adding scanner
       int number1= scanner.nextInt();// adding scanner
        System.out.println("plese enter second number");// addind scanner
        int number2= scanner.nextInt();//adding scanner
        Task1 task1=new Task1();
        task1.printlarger(number1,number2);// changing valriable
        task1.printlarger(77,35);// second line repeating to check different numbers
    }
}
