package dev.alexanderbell;

import java.util.Arrays;

public class LeetCodeFindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = -1, finish = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target && start == -1){
                start = i;
                finish = i;
            }
            if(nums[i] == target && start != -1){
                finish = i;
            }
            if(finish != -1 && nums[i] != target){
             break;
            }
        }
        if(start != -1){
            return new int[]{start,finish};
        }
        return new int[]{-1,-1};
    }
}
