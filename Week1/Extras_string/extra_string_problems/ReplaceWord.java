package week1_ExtraQuestions1;

import java.util.*;

public class ReplaceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String modifiedSentence = sentence.replace(oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);

	}

}
