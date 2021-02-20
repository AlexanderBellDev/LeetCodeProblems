package dev.alexanderbell;

import java.util.HashMap;

public class LeetCodeContainsDuplicatesII {
    public static void main(String[] args) {
        System.out.println( containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], i);
            }else {
                if(Math.abs(hashMap.get(nums[i]) - i) <= k){
                    return true;
                }else {
                    hashMap.put(nums[i],i);
                }
            }
        }


        return false;
    }
}
