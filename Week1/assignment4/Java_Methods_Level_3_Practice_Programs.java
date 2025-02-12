package week1_Assignment4;

import java.text.DateFormatSymbols;
import java.util.*;

public class Java_Methods_Level_3_Practice_Programs {
    
    // Generate random heights for football team
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }

    // Calculate sum of elements in an array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Calculate mean height
    public static double meanHeight(int[] heights) {
        return (double) sumArray(heights) / heights.length;
    }

    // Find shortest height
    public static int shortestHeight(int[] heights) {
        return Arrays.stream(heights).min().orElse(0);
    }

    // Find tallest height
    public static int tallestHeight(int[] heights) {
        return Arrays.stream(heights).max().orElse(0);
    }

    // Count number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits of a number in an array
    public static int[] getDigits(int num) {
        return Integer.toString(num).chars().map(c -> c - '0').toArray();
    }

    // Check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        return String.valueOf(num).contains("0");
    }

    // Check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int sum = Arrays.stream(digits).map(d -> (int) Math.pow(d, digits.length)).sum();
        return sum == num;
    }

    // Find the largest and second largest digit
    public static int[] largestTwoDigits(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    // Generate a 6-digit unique OTP
    public static Set<Integer> generateUniqueOTPs() {
        Set<Integer> otps = new HashSet<>();
        Random rand = new Random();
        while (otps.size() < 10) {
            otps.add(100000 + rand.nextInt(900000));
        }
        return otps;
    }

    // Display a calendar for given month and year
    public static void displayCalendar(int month, int year) {
        Calendar cal = new GregorianCalendar(year, month - 1, 1);
        System.out.println(new DateFormatSymbols().getMonths()[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < startDay; i++) System.out.print("    ");
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay - 1) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Tallest: " + tallestHeight(heights));
        System.out.println("Shortest: " + shortestHeight(heights));
        System.out.println("Mean Height: " + meanHeight(heights));
        
        int num = 153;
        System.out.println("Is Armstrong: " + isArmstrong(num));
        System.out.println("Is Duck: " + isDuckNumber(num));

        System.out.println("Unique OTPs: " + generateUniqueOTPs());
        
        displayCalendar(7, 2005);
    }
}
