package samples;

public class LongestIncreasingSubsequence {

    public static int longestIncreasingSubsequence(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1; // Reset the current length when sequence breaks
            }
        }

        // After the loop, compare once more to ensure the last sequence is considered
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5, 1, 7, 8, 9, 1};
        System.out.println("Longest Increasing Subsequence Length: " + longestIncreasingSubsequence(arr));
    }
}