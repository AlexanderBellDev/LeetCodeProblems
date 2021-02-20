package dev.alexanderbell;

import java.util.Arrays;

public class LeetCodeProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{2,3,5,0})));
    }

    public static int[] productExceptSelf(int[] nums) {
        // everything to left * everything to the right of the element
        int[] numsToLeft = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                numsToLeft[i] = nums[i];
            } else {
                numsToLeft[i] = nums[i] * numsToLeft[i - 1];
            }
        }
        int[] numsToRight = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                numsToRight[i] = nums[i];
            } else {
                numsToRight[i] = nums[i] * numsToRight[i + 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = numsToRight[i + 1];
            } else if (i == nums.length - 1) {
                nums[i] = numsToLeft[i - 1];
            } else {
                nums[i] = numsToLeft[i - 1] * numsToRight[i + 1];
            }

        }
        return nums;
    }
}
