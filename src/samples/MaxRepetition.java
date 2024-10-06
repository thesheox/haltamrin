package samples;

import java.util.Scanner;

public class MaxRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] array = {1, 2, 3, 2, 4, 2, 5, 3, 1};

        // Call the method to find the number with maximum repetition
        int maxRepeatedNumber = findMaxRepeatedNumber(array);

        // Display the result
        if (maxRepeatedNumber != -1) {
            System.out.println("The number with the maximum repetition is: " + maxRepeatedNumber);
        } else {
            System.out.println("The array is empty.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to find the number with maximum repetition in the array
    public static int findMaxRepeatedNumber(int[] array) {
        int length = array.length; // Length of the array
        if (length == 0) return -1; // Handle empty array case

        int maxCount = 0; // To keep track of the maximum count
        int maxRepeatedNumber = array[0]; // To store the number with maximum repetition

        for (int i = 0; i < length; i++) {
            int count = 1; // Initialize count for the current element

            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    count++; // Increment count if a match is found
                }
            }

            // Update maxCount and maxRepeatedNumber if current count is greater
            if (count > maxCount) {
                maxCount = count;
                maxRepeatedNumber = array[i];
            }
        }

        return maxRepeatedNumber; // Return the number with maximum repetition
    }
}