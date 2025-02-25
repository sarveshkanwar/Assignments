package week1_ExtraQuestions2;

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100, guess;
        String response;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (true) {
            guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            response = sc.next().toLowerCase();

            if (response.equals("correct")) {
                System.out.println("Hooray! I guessed it!");
                break;
            } else if (response.equals("high")) {
                high = guess - 1;
            } else if (response.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid response! Please enter 'high', 'low', or 'correct'.");
            }
        }
    }
}