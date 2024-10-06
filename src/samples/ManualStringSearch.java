package samples;

import java.util.Scanner;

public class ManualStringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main text
        System.out.print("Enter the main text: ");
        String text = scanner.nextLine();

        // Input the substring to search
        System.out.print("Enter the substring to search: ");
        String substring = scanner.nextLine();

        // Call the method to check if the substring is found
        boolean found = isSubstringFound(text, substring);

        // Output whether the substring was found or not
        if (found) {
            System.out.println("Substring found.");
        } else {
            System.out.println("Substring not found.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to manually check if the substring is found in the text
    public static boolean isSubstringFound(String text, String substring) {
        int textLength = text.length();
        int substringLength = substring.length();

        // Iterate through the main text
        for (int i = 0; i <= textLength - substringLength; i++) {
            int j;
            // Check each character in the substring
            for (j = 0; j < substringLength; j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    break; // If a character doesn't match, break and move to the next position
                }
            }
            // If the entire substring matches
            if (j == substringLength) {
                return true; // Return true if the substring is found
            }
        }

        return false; // Return false if the substring is not found
    }
}
