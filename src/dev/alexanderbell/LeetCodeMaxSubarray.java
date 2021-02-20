package dev.alexanderbell;

public class LeetCodeMaxSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                maxSoFar = Math.max(maxSoFar + nums[i], nums[i]);
                if (maxSoFar > max) max = maxSoFar;
            }
        }
        return max;
    }
}
