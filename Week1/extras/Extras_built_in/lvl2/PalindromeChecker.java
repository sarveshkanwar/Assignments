
package week1_ExtraQuestions2;

import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.println(input + " is " + (isPalindrome(input) ? "a palindrome." : "not a palindrome."));
    }
}
