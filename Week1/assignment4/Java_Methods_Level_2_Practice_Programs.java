package week1_Assignment4;

import java.util.*;

public class Java_Methods_Level_2_Practice_Programs {

    // Method to find factors of a number and return an array
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    // Method to find sum of squares of factors
    public static int sumOfSquareOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += Math.pow(factor, 2);
        return sum;
    }

    // Recursive method to find sum of n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) return 1;
        return n + sumOfNaturalNumbers(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Unit Converter Utility Class
    static class UnitConverter {
        public static double convertKmToMiles(double km) {
        	return km * 0.621371; 
        }
        public static double convertMilesToKm(double miles) {
        	return miles * 1.60934; 
        }
        public static double convertMetersToFeet(double meters) { 
        	return meters * 3.28084; 
        }
        public static double convertFeetToMeters(double feet) { 
        	return feet * 0.3048; 
        }
        public static double convertYardsToFeet(double yards) { 
        	return yards * 3; 
        }
        public static double convertFeetToYards(double feet) { 
        	return feet * 0.333333; 
        }
        public static double convertMetersToInches(double meters) { 
        	return meters * 39.3701; 
        }
        public static double convertInchesToMeters(double inches) { 
        	return inches * 0.0254; 
        }
        public static double convertFahrenheitToCelsius(double f) { 
        	return (f - 32) * 5 / 9; 
        }
        public static double convertCelsiusToFahrenheit(double c) { 
        	return (c * 9 / 5) + 32; 
        }
    }

    // Student Voting Eligibility Checker
    public static boolean canStudentVote(int age) {
        return age >= 18;
    }

    // Method to find youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = Arrays.stream(ages).min().orElse(Integer.MAX_VALUE);
        return names[Arrays.asList(ages).indexOf(minAge)];
    }

    // Method to find tallest friend
    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = Arrays.stream(heights).max().orElse(Integer.MIN_VALUE);
        return names[Arrays.asList(heights).indexOf(maxHeight)];
    }

    // Method to check positive/negative number
    public static boolean isPositive(int num) { return num > 0; }

    // Method to check even/odd
    public static boolean isEven(int num) { return num % 2 == 0; }

    // Method to compare numbers
    public static int compareNumbers(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    // Method to find BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    // Method to solve Quadratic Equation
    public static double[] findQuadraticRoots(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) return new double[]{};
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else return new double[]{(-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)};
    }

    // Method to generate random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) numbers[i] = 1000 + new Random().nextInt(9000);
        return numbers;
    }

    // Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = Arrays.stream(numbers).sum();
        int min = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        return new double[]{sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = scanner.nextInt();
        int[] factors = findFactors(num);
        
        System.out.println("Factors: " + Arrays.toString(factors));
        
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        
        
        System.out.println("Product of factors: " + productOfFactors(factors));
        
        
        System.out.println("Sum of squares of factors: " + sumOfSquareOfFactors(factors));
        
        
        System.out.print("Enter a number to find sum of natural numbers: ");
        int n = scanner.nextInt();
        System.out.println("Sum using recursion: " + sumOfNaturalNumbers(n));
        System.out.println("Sum using formula: " + sumUsingFormula(n));
        
        
        System.out.print("Enter a year to check leap year: ");
        int year = scanner.nextInt();
        System.out.println(year + " is a Leap Year? " + isLeapYear(year));
    }
}

