package week1_Assignment5;

import java.util.*;

public class Java_Arrays_Level_1_Lab_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Voting Eligibility
        int[] ages = new int[10];

        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }

        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18 && age <= 100) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
        
        
        
        
        
        
        // Checking number is positive or negative or zero
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than the last.");
        } else {
            System.out.println("First and last elements are equal.");
        }
        
        
        
        
        
        
        
        
        // Multiplication table
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        
        
        
        
        
        
        
        // Store multiple value until max
        
        double[] numbers1 = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (max 10). Enter 0 or a negative number to stop:");
        while (true) {
            double num = scanner.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers1[index++] = num;
        }

        System.out.println("Stored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers1[i] + " ");
            total += numbers1[i];
        }

        System.out.println("\nSum of all numbers: " + total);
        
        
        
        
        
        
        
        
        
        // Multiplication 6 to 9
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number1 * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number1 + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        
        
        
        
        
        
        
        
        // Mean height of football team
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("The mean height of the football team is: " + mean);
        
        
        
        
        
        
        
        
        
        // Store Odd Even Numbers
        System.out.print("Enter a natural number: ");
        int number11 = scanner.nextInt();

        if (number11 <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        int[] evenNumbers = new int[number11 / 2 + 1];
        int[] oddNumbers = new int[number11 / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number11; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        
        
        
        
        
        
        
        // Factors of Number
        System.out.print("Enter a number: ");
        int number5 = scanner.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index1 = 0;

        for (int i = 1; i <= number11; i++) {
            if (number11 % i == 0) {
                if (index1 == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index1++] = i;
            }
        }

        System.out.print("Factors of " + number11 + ": ");
        for (int i = 0; i < index1; i++) {
            System.out.print(factors[i] + " ");
        }
        
        
        
        
        
        
        // Copy 2D into 1D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int index2 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index2++] = matrix[i][j];
            }
        }

        System.out.print("1D Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        
        
        
        
        
        // Fizz Buzz Program
        System.out.print("Enter a positive integer: ");
        int number6 = scanner.nextInt();

        if (number6 <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        String[] results = new String[number6 + 1];

        for (int i = 0; i <= number6; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= number6; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        
        
        
        scanner.close();

	}

}
