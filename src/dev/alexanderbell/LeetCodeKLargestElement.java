package dev.alexanderbell;

import java.util.Arrays;

public class LeetCodeKLargestElement {
    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,1,5,6,4},2);
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        k = nums.length - k;
        return nums[k];
    }
}
