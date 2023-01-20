package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        factorial();
    }
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int number, i;
        long fact = 1;
        System.out.println("Please enter the number that you want factorial");
        number = scanner.nextInt();
        //if (number < 0) {
           // System.out.println(" There is no factorial number fro negative number (SORRY)");
        //} else {
            for (i = number; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.printf("%d! = %d", number, fact);
        }

    }





