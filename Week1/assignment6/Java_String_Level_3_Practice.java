package week1_Assignment6;


import java.util.*;

public class Java_String_Level_3_Practice {
    
    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";
            result[i] = new String[]{String.valueOf(weight), String.valueOf(data[i][1]), String.format("%.2f", bmi), status};
        }
        return result;
    }

    // Method to display BMI data
    public static void displayBMI(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }
    
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        char[] result = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) result[index++] = ch;
        }
        return Arrays.copyOf(result, index);
    }
    
    // Method to find first non-repeating character
    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) if (freq[text.charAt(i)] == 1) return text.charAt(i);
        return '\0';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // BMI Calculation
        double[][] members = new double[10][2];
        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            members[i][0] = sc.nextDouble();
            members[i][1] = sc.nextDouble();
        }
        String[][] bmiData = calculateBMI(members);
        displayBMI(bmiData);
        
        // Unique characters in a string
        System.out.println("Enter a string to find unique characters:");
        String input = sc.next();
        System.out.println("Unique characters: " + Arrays.toString(uniqueCharacters(input)));
        
        // First non-repeating character
        System.out.println("First non-repeating character: " + firstNonRepeating(input));
        
        sc.close();
    }
}
