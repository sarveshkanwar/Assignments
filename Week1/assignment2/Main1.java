package week1_Assignment2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + 
                           (number1 + number2) + ", " + (number1 - number2) + ", " + (number1 * number2) + ", and " + (number1 / number2));
        
        

        System.out.print("Enter base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
        
        

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        System.out.println("The length of the side is " + (perimeter / 4) + " whose perimeter is " + perimeter);

        
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

        
        
        System.out.print("Enter unit price of item: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        System.out.println("The total purchase price is INR " + (unitPrice * quantity) + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("The Quotient is " + (num1 / num2) + " and Reminder is " + (num1 % num2) + " of two numbers " + num1 + " and " + num2);

        input.close();
    }
}
