package dev.alexanderbell;

import java.util.HashMap;

public class LeetCodeHouseRobber {
    static HashMap<Integer, Integer> sums = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,11,5}));
    }

    public static int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        }
        return dp[dp.length-1];
    }
}
