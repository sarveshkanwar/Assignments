package week1_Assignment3;

import java.util.Scanner;

public class Java_Control_Flow_Level_2_LabPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print odd and even numbers up to user-entered number
        System.out.print("Enter a natural number: ");
        int num = input.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Not a natural number.");
        }

        
        
        
        // Employee bonus calculation
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus as service is less than 5 years.");
        }

        
        
     
        // Multiplication table from 6 to 9
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        
        
        
        // FizzBuzz using for loop
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive integer.");
        }

        
        
        
        // FizzBuzz using while loop
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();
        if (n > 0) {
            int i = 1;
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Enter a positive integer.");
        }
        
        
        
        

        // Find the youngest and tallest among three friends
        System.out.print("Enter Amar's age and height: ");
        int age1 = input.nextInt();
        double height1 = input.nextDouble();
        System.out.print("Enter Akbar's age and height: ");
        int age2 = input.nextInt();
        double height2 = input.nextDouble();
        System.out.print("Enter Anthony's age and height: ");
        int age3 = input.nextInt();
        double height3 = input.nextDouble();

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        double tallestHeight = Math.max(height1, Math.max(height2, height3));

        String youngest = (youngestAge == age1) ? "Amar" : (youngestAge == age2) ? "Akbar" : "Anthony";
        String tallest = (tallestHeight == height1) ? "Amar" : (tallestHeight == height2) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        
        
        
        // Find factors of a number
        System.out.print("Enter a number to find its factors: ");
        int factorNum = input.nextInt();
        System.out.print("Factors of " + factorNum + " are: ");
        for (int i = 1; i <= factorNum; i++) {
            if (factorNum % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        
        
     // Find the greatest factor of a number (excluding itself)
        System.out.print("Enter a number to find its greatest factor: ");
        int number1 = input.nextInt();
        int greatestFactor = 1;

        for (int i = number1 - 1; i >= 1; i--) {
            if (number1 % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor (excluding itself): " + greatestFactor);

        
        
        // Find the power of a number
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int power = input.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + power + " is: " + result);

        
        
        
        // Find all multiples of a number below 100
        System.out.print("Enter a number to find its multiples below 100: ");
        int multipleNum = input.nextInt();
        System.out.print("Multiples of " + multipleNum + " below 100: ");
        
        for (int i = 100; i >= 1; i--) {
            if (i % multipleNum == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        

        input.close();
    }
}
