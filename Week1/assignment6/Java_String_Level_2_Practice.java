package week1_Assignment6;

import java.util.Random;
import java.util.Scanner;

public class Java_String_Level_2_Practice {
    
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitText(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        
        String[] words = new String[count];
        int index = 0, start = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        return words;
    }

    public static boolean compareWordArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    
    
    
    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        
        String[] words = new String[count];
        int index = 0, start = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                words[index++] = text.substring(start, i == text.length() - 1 ? i + 1 : i);
                start = i + 1;
            }
        }
        
        return words;
    }
    
    
    
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    
    
    
    public static int findLength1(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    
    
    
    
    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = minLength;
        
        for (int i = 1; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        
        return new int[]{minIndex, maxIndex};
    }
    
    
    
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    
    
    
    
    public static String[][] getCharacterTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = classifyCharacter(ch);
        }
        return result;
    }
    
    
    
    
    public static String classifyCharacter(char ch) {
        char lower = Character.toLowerCase(ch);
        if (lower >= 'a' && lower <= 'z') {
            if ("aeiou".indexOf(lower) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    
    
    
 // Method to trim leading and trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    // Method to create a substring manually
    public static String manualSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    // Voting eligibility check
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(81) + 10; // Generates age between 10-90
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // Rock-Paper-Scissors Game
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Scissors") && computer.equals("Paper")) ||
            (user.equals("Paper") && computer.equals("Rock"))) {
            return "User Wins";
        }
        return "Computer Wins";
    }
    
    
    
 // Generate random 2-digit scores for PCM
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        Random rand = new Random();
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics (60-100)
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry (60-100)
            scores[i][2] = rand.nextInt(41) + 60; // Math (60-100)
        }
        return scores;
    }
    
    // Compute total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(average * 100.0) / 100.0; // Round to 2 decimals
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    
    // Assign grades based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) grades[i] = "A+";
            else if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    
    // Display the student scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int lengthCustom = findLength(input);
        int lengthBuiltIn = input.length();
        System.out.println("Custom length: " + lengthCustom);
        System.out.println("Built-in length: " + lengthBuiltIn);
        
        String[] customWords = splitText(input);
        String[] builtInWords = input.split(" ");
        
        System.out.println("Custom split result:");
        for (String word : customWords) {
            System.out.print(word + " | ");
        }
        System.out.println();
        
        System.out.println("Built-in split result:");
        for (String word : builtInWords) {
            System.out.print(word + " | ");
        }
        System.out.println();
        
        boolean isSame = compareWordArrays(customWords, builtInWords);
        System.out.println("Are the split results same? " + isSame);
        
        String[][] wordLengthsArray = wordLengths(customWords);
        System.out.println("Word and their lengths:");
        System.out.println("Word\tLength");
        for (String[] pair : wordLengthsArray) {
            System.out.println(pair[0] + "\t" + Integer.parseInt(pair[1]));
        }
        
        
        System.out.print("Enter a sentence: ");
        String input1 = scanner.nextLine();
        
        String[] words = splitWords(input1);
        String[][] wordLengths = getWordLengths(words);
        int[] minMaxIndexes = findShortestAndLongest(wordLengths);
        
        System.out.println("\nWords and their lengths:");
        for (String[] word : wordLengths) {
            System.out.println(word[0] + " - " + word[1]);
        }
        
        System.out.println("\nShortest word: " + wordLengths[minMaxIndexes[0]][0]);
        System.out.println("Longest word: " + wordLengths[minMaxIndexes[1]][0]);
        
        int[] vowelConsonantCount = countVowelsAndConsonants(input1);
        System.out.println("\nVowel count: " + vowelConsonantCount[0]);
        System.out.println("Consonant count: " + vowelConsonantCount[1]);
        
        String[][] charTypes = getCharacterTypes(input1);
        
        System.out.println("\nCharacter Analysis:");
        System.out.println("Character | Type");
        System.out.println("-----------------");
        for (String[] row : charTypes) {
            System.out.println(row[0] + "         | " + row[1]);
        }
        
        
        
     // Trimming leading & trailing spaces
        System.out.print("Enter a string with spaces: ");
        String input2 = scanner.nextLine();
        int[] indices = findTrimIndices(input2);
        String trimmed = manualSubstring(input2, indices[0], indices[1]);
        System.out.println("Trimmed manually: " + trimmed);
        System.out.println("Trimmed using built-in method: " + input2.trim());
        System.out.println("Comparison: " + compareStrings(trimmed, input2.trim()));

        
        
        // Voting eligibility
        int[] ages = generateAges(10);
        String[][] votingResult = checkVotingEligibility(ages);
        System.out.println("\nVoting Eligibility:");
        System.out.println("Age | Eligibility");
        for (String[] row : votingResult) {
            System.out.println(row[0] + " | " + row[1]);
        }

        
        
        // Rock-Paper-Scissors
        System.out.print("\nEnter number of rounds: ");
        int rounds = scanner.nextInt();
        scanner.nextLine();
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < rounds; i++) {
            System.out.print("Choose Rock, Paper, or Scissors: ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            String result = determineWinner(userChoice, computerChoice);
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + result);
            if (result.equals("User Wins")) userWins++;
            if (result.equals("Computer Wins")) computerWins++;
        }
        System.out.println("\nFinal Stats: ");
        System.out.println("User Wins: " + userWins + ", Computer Wins: " + computerWins);
        double userWinPercentage = ((double) userWins / rounds) * 100;
        double compWinPercentage = ((double) computerWins / rounds) * 100;
        System.out.println("User Win %: " + userWinPercentage + " | Computer Win %: " + compWinPercentage);
        
        
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        
        displayScorecard(scores, results, grades);

        
        scanner.close();
    }
}

