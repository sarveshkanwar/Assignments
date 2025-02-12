package week1_Assignment3;

import java.util.Scanner;

public class Java_Control_Flow_Level_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Leap Year check using multiple if-else statements
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later.");
        }

        
        
        
        // Leap Year check using a single if condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        
        
        

        // Compute percentage and grade based on marks
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        int total = physics + chemistry + maths;
        double percentage = (total / 3.0);
        System.out.println("Average Marks: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (percentage >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (percentage >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (percentage >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (percentage >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        
        
        // Check if a number is prime
        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();
        boolean isPrime = number > 1;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
        
        
        
        // Check if a number is an Armstrong number
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number1 = input.nextInt();
        int originalNumber = number1;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        if (sum == number1) {
            System.out.println(number1 + " is an Armstrong number.");
        } else {
            System.out.println(number1 + " is NOT an Armstrong number.");
        }

        
        
        
        // Count the number of digits in an integer
        System.out.print("Enter a number to count its digits: ");
        number1 = input.nextInt();
        int count = 0;
        originalNumber = number1;

        while (originalNumber != 0) {
            originalNumber /= 10;
            count++;
        }

        System.out.println("The number of digits in " + number1 + " is: " + count);

        
        
        // Calculate BMI
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();

        height /= 100; // Convert cm to meters
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        
        
        
        // Check if a number is a Harshad Number
        System.out.print("Enter a number to check if it's a Harshad Number: ");
        int fristnum = input.nextInt();
        int sum1 = 0, temp = fristnum;

        while (temp > 0) {
            sum1 += temp % 10;
            temp /= 10;
        }

        if (fristnum % sum1 == 0) {
            System.out.println(fristnum + " is a Harshad Number.");
        } else {
            System.out.println(fristnum + " is NOT a Harshad Number.");
        }

        
        
        
        // Check if a number is an Abundant Number
        System.out.print("Enter a number to check if it's an Abundant Number: ");
        fristnum = input.nextInt();
        sum1 = 0;

        for (int i = 1; i < fristnum; i++) {
            if (fristnum % i == 0) {
                sum1 += i;
            }
        }

        if (sum1 > fristnum) {
            System.out.println(fristnum + " is an Abundant Number.");
        } else {
            System.out.println(fristnum + " is NOT an Abundant Number.");
        }
        
        
        
        
        

        // Simple Calculator using switch case
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = input.next().charAt(0);
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        double result;
        switch (op) {
            case '+':
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator!");
        }
        
        
        
        
        // Day week program
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of the week: " + d0);
	}

}
