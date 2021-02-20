package dev.alexanderbell;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeContainsDuplicate {
    public static void main(String[] args) {
        containsDuplicate(new int[]{1,2,3,1});
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if(!integers.contains(num)){
                integers.add(num);
            }else return true;
        }
        return false;
    }

//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if(i > 0 && nums[i-1] == nums[i]){
//                return true;
//            }
//        }
//        return false;
//    }
}
