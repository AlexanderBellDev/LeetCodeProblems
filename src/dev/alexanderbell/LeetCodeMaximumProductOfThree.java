package dev.alexanderbell;

import java.util.Arrays;

public class LeetCodeMaximumProductOfThree {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-100, -98, -1, 2, 3, 4}));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1] * nums[nums.length-2] * nums[nums.length -3], nums[0] * nums[1] * nums[nums.length-1]);
    }
}
