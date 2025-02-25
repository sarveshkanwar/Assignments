package week1_ExtraQuestions1;

import java.util.*;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }
        System.out.println("Toggled String: " + result);

	}

}
