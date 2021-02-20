package dev.alexanderbell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCodeIntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> valueOccurenceHashmap = new HashMap<>();
        for (int i : nums1) {
            if(!valueOccurenceHashmap.containsKey(i)){
                valueOccurenceHashmap.put(i,0);
            }
        }
        for (int i : nums2) {
            if(valueOccurenceHashmap.containsKey(i)){
                valueOccurenceHashmap.put(i,valueOccurenceHashmap.get(i)+1);
            }
        }
        int size = 0;
        for (Integer integer : valueOccurenceHashmap.keySet()) {
            if(valueOccurenceHashmap.get(integer) > 0){
                size ++;
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (Integer integer : valueOccurenceHashmap.keySet()) {
            if(valueOccurenceHashmap.get(integer) > 0){
               result[index] = integer;
               index++;
            }
        }
       return result;
    }
}
