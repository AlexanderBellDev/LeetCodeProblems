package dev.alexanderbell;

import java.util.HashSet;

public class LeetCodeThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,-2147483648}));
    }

    public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int num : nums) {
                 if(num > max) {
                     max = num;
                 }
             }
        for (int num : nums) {
            if(num > second && num < max) {
                second = num;
            }
        }
        for (int num : nums) {
            if(num >= third && num < second) {
                third = num;
            }
        }
        return (int) (third !=Long.MIN_VALUE ? third: max);
    }
}
