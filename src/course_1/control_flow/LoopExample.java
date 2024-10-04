package course_1.control_flow;

public class LoopExample {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // Print numbers from 1 to 3 using a do-while loop
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;  // Increment the number
        } while (num <= 3);  // Condition is checked after executing the block

        // Create an array of numbers
        int[] numbers = {1, 2, 3, 4, 5};

        // Iterate through each number using a for-each loop
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
