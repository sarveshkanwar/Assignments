package week1_Assignment3;

import java.util.Scanner;

public class Level1Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Check divisibility by 5
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));

        
        
        
        // Check if first number is the smallest
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        System.out.println("Is the first number the smallest? " + (num1 < num2 && num1 < num3));

        
        
        
        // Check which number is the largest
        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3));
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3));
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2));

        
        
        
        // Sum of n natural numbers
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n > 0) {
            System.out.println("The sum of " + n + " natural numbers is " + (n * (n + 1) / 2));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        
        
        
        

        // Check voting eligibility
        System.out.print("Enter age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        
        
        
        
        // Check if a number is positive, negative, or zero
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        if (number1 > 0) {
            System.out.println("Positive");
        } else if (number1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        
        
        
        // Check if the given month and day is in the Spring Season
        System.out.print("Enter month and day: ");
        int month = input.nextInt(), day = input.nextInt();
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        
        
        
        
        //  Count using while loop
        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launched!");

        // Count using for loop
        System.out.print("Enter countdown number: ");
        int countdown = input.nextInt();
        for (int i = countdown; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");

        
        
        
        
        // Sum of numbers until user enters 0
        double total = 0;
        double value;
        System.out.println("Enter numbers (0 to stop): ");
        while ((value = input.nextDouble()) != 0) {
            total += value;
        }
        System.out.println("Total sum: " + total);

        
        
        
        // Sum of numbers until user enters 0 or a negative number
        total = 0;
        System.out.println("Enter numbers (0 or negative to stop): ");
        while (true) {
            value = input.nextDouble();
            if (value <= 0) break;
            total += value;
        }
        System.out.println("Total sum: " + total);

        
        
        
        // Sum of n natural numbers using while loop and formula comparison
        System.out.print("Enter a natural number: ");
        int n1 = input.nextInt();
        if (n1 > 0) {
            int sumFormula = n1 * (n1 + 1) / 2;
            int sumLoop = 0, i = 1;
            while (i <= n1) {
                sumLoop += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Both results are " + (sumFormula == sumLoop ? "correct" : "incorrect"));
        } else {
            System.out.println("Not a natural number");
        }
        
        
        
        
        // Sum of n Natural Numbers using for loop
        System.out.print("Enter a natural number: ");
        int n11 = input.nextInt();
        if (n11 > 0) {
            int sumFormula = n11 * (n11 + 1) / 2;
            int sumLoop = 0;
            for (int i = 1; i <= n11; i++) {
                sumLoop += i;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Both results are " + (sumFormula == sumLoop ? "correct" : "incorrect"));
        } else {
            System.out.println("Not a natural number");
        }

        
        
        
        // Factorial of a number using while loop
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        if (num >= 0) {
            int factorial = 1, i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        
        
        
        // Factorial of a number using for loop
        System.out.print("Enter a positive integer: ");
        num = input.nextInt();
        if (num >= 0) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        
        
        
        // Print odd and even numbers from 1 to the user-entered number
        System.out.print("Enter a natural number: ");
        int limit = input.nextInt();
        if (limit > 0) {
            for (int i = 1; i <= limit; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Enter a valid natural number.");
        }

        
        
        
        // Calculate employee bonus
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus as service is less than 5 years.");
        }
        
        
        

        // Multiplication table from 6 to 9
        System.out.print("Enter a number: ");
        int num5 = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num5 + " * " + i + " = " + (num5 * i));
        }
        
 
        
        input.close();
    }
}
