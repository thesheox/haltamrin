package samples;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example sorted array (must be sorted for binary search to work)
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Prompt user for the target value
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        // Display the result
        if (result == -1) {
            System.out.println("The number " + target + " is not present in the array.");
        } else {
            System.out.println("The number " + target + " is found at index: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2; // Avoids overflow for large indices

            // Check if target is present at mid
            if (array[middle] == target) {
                return middle; // Return the index of the target element
            }

            // If target is greater, ignore the left half
            if (array[middle] < target) {
                left = middle + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = middle - 1;
            }
        }

        // Return -1 if the element is not found
        return -1;
    }
}
