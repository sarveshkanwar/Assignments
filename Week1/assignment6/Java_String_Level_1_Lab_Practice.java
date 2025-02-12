package week1_Assignment6;

import java.util.Scanner;

public class Java_String_Level_1_Lab_Practice {

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Create a substring using charAt()
    public static String createSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // Get characters without toCharArray()
    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    // Demonstrate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    // Demonstrate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBounds() {
        String s = "Hello";
        System.out.println(s.charAt(10));
    }

    public static void handleStringIndexOutOfBounds() {
        try {
            generateStringIndexOutOfBounds();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    // Demonstrate IllegalArgumentException
    public static void generateIllegalArgumentException() {
        String s = "Hello";
        System.out.println(s.substring(4, 2));
    }

    public static void handleIllegalArgumentException() {
        try {
            generateIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    // Demonstrate NumberFormatException
    public static void generateNumberFormatException() {
        String s = "abc";
        int num = Integer.parseInt(s);
    }

    public static void handleNumberFormatException() {
        try {
            generateNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    // Demonstrate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBounds() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
    }

    public static void handleArrayIndexOutOfBounds() {
        try {
            generateArrayIndexOutOfBounds();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    // Convert text to uppercase without toUpperCase()
    public static String toUpperCaseManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c >= 'a' && c <= 'z' ? (char) (c - 32) : c);
        }
        return sb.toString();
    }

    // Convert text to lowercase without toLowerCase()
    public static String toLowerCaseManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c >= 'A' && c <= 'Z' ? (char) (c + 32) : c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Compare two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        System.out.println("Manual comparison: " + compareStrings(str1, str2));
        System.out.println("Built-in equals(): " + str1.equals(str2));

        // Create substring
        System.out.print("Enter string for substring: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        System.out.println("Manual substring: " + createSubstring(text, start, end));
        System.out.println("Built-in substring(): " + text.substring(start, end));

        // Convert to uppercase
        System.out.print("Enter text to convert to uppercase: ");
        scanner.nextLine(); // Consume newline
        String upperInput = scanner.nextLine();
        System.out.println("Manual uppercase: " + toUpperCaseManual(upperInput));
        System.out.println("Built-in uppercase: " + upperInput.toUpperCase());

        // Convert to lowercase
        System.out.print("Enter text to convert to lowercase: ");
        String lowerInput = scanner.nextLine();
        System.out.println("Manual lowercase: " + toLowerCaseManual(lowerInput));
        System.out.println("Built-in lowercase: " + lowerInput.toLowerCase());

        // Demonstrating exceptions
        handleNullPointerException();
        handleStringIndexOutOfBounds();
        handleIllegalArgumentException();
        handleNumberFormatException();
        handleArrayIndexOutOfBounds();

        scanner.close();
    }
}
