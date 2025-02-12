package week1_Assignment4;
import java.util.*;
public class Java_Methods_Level_1_Practice_Programs {		
		
		// Function to calculate Simple Interest
	    public static double calculateSimpleInterest(double principal, double rate, double time) {
	        return (principal * rate * time) / 100;
	    }

	    
	    // Function to calculate the maximum number of handshakes
	    public static int calculateHandshakes(int n) {
	        return (n * (n - 1)) / 2;
	    }

	    
	    
	    // Function to calculate the number of rounds needed to complete a 5km run
	    public static int calculateRounds(double side1, double side2, double side3) {
	        double perimeter = side1 + side2 + side3;
	        return (int) Math.ceil(5000 / perimeter);
	    }

	    
	    
	    // Function to check if a number is positive, negative, or zero
	    public static int checkNumber(int number) {
	        if (number > 0) return 1;
	        else if (number < 0) return -1;
	        else return 0;
	    }

	    
	    
	    // Function to check if the given date falls in the Spring Season
	    public static boolean isSpringSeason(int month, int day) {
	        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
	    }
	       
	    
	    
	    // Function to find the sum of first n natural numbers using a loop
	    public static int findSumOfNaturalNumbers(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    
	    
	    // Function to find the smallest and largest of three numbers
	    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
	        int smallest = Math.min(number1, Math.min(number2, number3));
	        int largest = Math.max(number1, Math.max(number2, number3));
	        return new int[]{smallest, largest};
	    }

	    
	    
	    // Function to find the quotient and remainder of two numbers
	    public static int[] findRemainderAndQuotient(int number, int divisor) {
	        int quotient = number / divisor;
	        int remainder = number % divisor;
	        return new int[]{quotient, remainder};
	    }

	    
	    
	    // Function to divide chocolates among children and find the remaining chocolates
	    public static int[] distributeChocolates(int chocolates, int children) {
	        return findRemainderAndQuotient(chocolates, children);
	    }

	    
	    
	    // Function to calculate wind chill temperature
	    public static double calculateWindChill(double temperature, double windSpeed) {
	        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
	    }

	    
	    
	    // Function to calculate trigonometric values (sine, cosine, tangent) of an angle
	    public static double[] calculateTrigonometricFunctions(double angle) {
	        double radians = Math.toRadians(angle);
	        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
	    }

	    
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        // Simple Interest Calculation
	        System.out.print("Enter Principal: ");
	        double principal = scanner.nextDouble();
	        System.out.print("Enter Rate of Interest: ");
	        double rate = scanner.nextDouble();
	        System.out.print("Enter Time (in years): ");
	        double time = scanner.nextDouble();
	        System.out.println("The Simple Interest is " + calculateSimpleInterest(principal, rate, time));

	        
	        
	        
	        // Maximum Handshakes Calculation
	        System.out.print("\nEnter number of students for handshake calculation: ");
	        int numberOfStudents = scanner.nextInt();
	        System.out.println("Maximum number of handshakes: " + calculateHandshakes(numberOfStudents));

	        
	        
	        
	        // Athlete Running in a Triangular Park
	        System.out.print("\nEnter first side of the triangle (meters): ");
	        double side1 = scanner.nextDouble();
	        System.out.print("Enter second side of the triangle (meters): ");
	        double side2 = scanner.nextDouble();
	        System.out.print("Enter third side of the triangle (meters): ");
	        double side3 = scanner.nextDouble();
	        System.out.println("The athlete needs to complete " + calculateRounds(side1, side2, side3) + " rounds to finish a 5 km run.");

	        
	        
	        
	        // Check if a number is positive, negative, or zero
	        System.out.print("\nEnter a number to check its type: ");
	        int number = scanner.nextInt();
	        int result = checkNumber(number);
	        if (result == 1) {
	            System.out.println("The number is Positive.");
	        } else if (result == -1) {
	            System.out.println("The number is Negative.");
	        } else {
	            System.out.println("The number is Zero.");
	        }

	        
	        
	        
	        // Check for Spring Season
	        System.out.print("\nEnter Month (1-12): ");
	        int month = scanner.nextInt();
	        System.out.print("Enter Day: ");
	        int day = scanner.nextInt();
	        if (isSpringSeason(month, day)) {
	            System.out.println("It's a Spring Season.");
	        } else {
	            System.out.println("Not a Spring Season.");
	        }
	        
	        
	        
	        
	        
	        // Sum of N natural numbers
	        System.out.print("Enter a number to find the sum of N natural numbers: ");
	        int n = scanner.nextInt();
	        System.out.println("Sum of first " + n + " natural numbers: " + findSumOfNaturalNumbers(n));

	        
	        
	        
	        
	        // Smallest and Largest of Three Numbers
	        System.out.print("\nEnter three numbers: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();
	        int[] minMax = findSmallestAndLargest(num1, num2, num3);
	        System.out.println("Smallest: " + minMax[0] + ", Largest: " + minMax[1]);

	        
	        
	        
	        
	        // Quotient and Remainder Calculation
	        System.out.print("\nEnter a number and divisor: ");
	        int number10 = scanner.nextInt();
	        int divisor = scanner.nextInt();
	        int[] quotientRemainder = findRemainderAndQuotient(number10, divisor);
	        System.out.println("Quotient: " + quotientRemainder[0] + ", Remainder: " + quotientRemainder[1]);

	        
	        
	        
	        
	        // Chocolate Distribution
	        System.out.print("\nEnter the number of chocolates and number of children: ");
	        int chocolates = scanner.nextInt();
	        int children = scanner.nextInt();
	        int[] chocolateResult = distributeChocolates(chocolates, children);
	        System.out.println("Each child gets: " + chocolateResult[0] + " chocolates, Remaining: " + chocolateResult[1]);

	        
	        
	        
	        
	        // Wind Chill Calculation
	        System.out.print("\nEnter temperature (°F) and wind speed (mph): ");
	        double temperature = scanner.nextDouble();
	        double windSpeed = scanner.nextDouble();
	        System.out.println("Wind Chill Temperature: " + calculateWindChill(temperature, windSpeed));

	        
	        
	        
	        
	        // Trigonometric Functions Calculation
	        System.out.print("\nEnter an angle in degrees: ");
	        double angle = scanner.nextDouble();
	        double[] trigValues = calculateTrigonometricFunctions(angle);
	        System.out.println("Sine: " + trigValues[0] + ", Cosine: " + trigValues[1] + ", Tangent: " + trigValues[2]);

	}

}
