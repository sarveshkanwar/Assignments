package week1_Assignment1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int birthYear = 2000, currentYear = 2024;
        System.out.println("Harry's age in 2024 is " + (currentYear - birthYear));
        
        

        int maths = 94, physics = 95, chemistry = 96;
        System.out.println("Sam’s average mark in PCM is " + ((maths + physics + chemistry) / 3.0));
        
        

        double km = 10.8, miles = km * 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
        
        

        int costPrice = 129, sellingPrice = 191, profit = sellingPrice - costPrice;
        double profitPercent = (profit / (double) costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
        
        

        int totalPens = 14, students = 3, perStudent = totalPens / students, remaining = totalPens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
        
        
        
        int fee = 125000, discountPercent = 10;
        int discount = (fee * discountPercent) / 100;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
        
        

        double radius = 6378, volumeKm = (4.0 / 3) * Math.PI * Math.pow(radius, 3), volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);

        
        
        System.out.print("Enter distance in kilometers: ");
        double kilometer = input.nextDouble();
        System.out.println("The total miles is " + (kilometer / 1.6) + " mile for the given " + kilometer + " km");

        
        
        System.out.print("Enter student fee: ");
        int studentFee = input.nextInt();
        System.out.print("Enter discount percent: ");
        int discountRate = input.nextInt();
        int studentDiscount = (studentFee * discountRate) / 100;
        System.out.println("The discount amount is INR " + studentDiscount + " and final discounted fee is INR " + (studentFee - studentDiscount));

        
        
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        double heightInches = heightCm / 2.54, heightFeet = heightInches / 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int) heightFeet + " and inches is " + (heightInches % 12));
        
        
        
        
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

        
        
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);

	}

}
