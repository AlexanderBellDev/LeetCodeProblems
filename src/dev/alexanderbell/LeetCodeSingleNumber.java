package dev.alexanderbell;

import java.util.HashMap;

public class LeetCodeSingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> exists = new HashMap<>();
        for (int num : nums) {
            if(exists.get(num) == null){
                exists.put(num,false);
            }else {
                exists.put(num,true);
            }
        }

        for (Integer integer : exists.keySet()) {
            if(!exists.get(integer)){
                return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1}));
    }
}
