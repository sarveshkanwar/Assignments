package week1_ExtraQuestions1;

import java.util.*;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        char maxChar = ' ';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
            }
        }
        System.out.println("Most Frequent Character: " + maxChar);

	}

}
