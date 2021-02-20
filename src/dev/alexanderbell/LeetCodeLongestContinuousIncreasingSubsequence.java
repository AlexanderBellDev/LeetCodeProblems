package dev.alexanderbell;

public class LeetCodeLongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {

    }

    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;
        int currentSize = 1, maxSize = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] > nums[i-1]){
                currentSize++;
                if(currentSize > maxSize) maxSize = currentSize;
            }else {
                currentSize = 1;
            }
        }
        return maxSize;
    }
}
