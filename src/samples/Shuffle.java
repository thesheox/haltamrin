package samples;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        shuffleArray(array);

        // Print the shuffled array
        System.out.println("Shuffled array: " + Arrays.toString(array));
    }

    // Method to shuffle the array
    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            // Generate a random index to swap with
            int randomIndexToSwap = rand.nextInt(array.length);

            // Swap the elements
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
    }
}
