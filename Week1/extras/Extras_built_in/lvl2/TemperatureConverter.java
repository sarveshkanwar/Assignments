package week1_ExtraQuestions2;

import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F)? ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.println("Converted: " + fahrenheitToCelsius(temp) + "°C");
        } else if (choice == 'F' || choice == 'f') {
            System.out.println("Converted: " + celsiusToFahrenheit(temp) + "°F");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}