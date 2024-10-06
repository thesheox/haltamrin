package samples;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        // Create a character array to hold the reversed characters
        char[] reversedArray = new char[str.length()];

        // Single loop to fill the reversed array
        for (int i = 0; i < str.length(); i++) {
            reversedArray[i] = str.charAt(str.length() - 1 - i); // Reverse the characters
        }

        // Convert the reversed character array back to a string
        return new String(reversedArray); // Return the reversed string
    }
}