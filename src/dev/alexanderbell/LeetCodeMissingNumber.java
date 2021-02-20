package dev.alexanderbell;

public class LeetCodeMissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int highest = nums.length;
        int expectedSum = 0;
        for (int i = highest; i >= 0; i--) {
            expectedSum = expectedSum + i;
        }
        int actualSum = 0;
        for (int num : nums) {
            actualSum = actualSum + num;
        }
        return Math.abs(expectedSum - actualSum);
    }
}
