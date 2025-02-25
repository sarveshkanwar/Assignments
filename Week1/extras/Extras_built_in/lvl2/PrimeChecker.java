package week1_ExtraQuestions2;

import java.util.*;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isPrime(num) ? "a prime number." : "not a prime number."));
    }
}