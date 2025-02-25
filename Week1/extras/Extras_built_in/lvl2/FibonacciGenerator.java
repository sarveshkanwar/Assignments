package week1_ExtraQuestions2;

import java.util.*;

public class FibonacciGenerator {
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < terms; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        generateFibonacci(terms);
    }
}