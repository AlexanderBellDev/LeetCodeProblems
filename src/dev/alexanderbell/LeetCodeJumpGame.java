//package dev.alexanderbell;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//
//public class LeetCodeJumpGame {
//    public static void main(String[] args) {
//        System.out.println(canJump(new int[]{3,0,8,2,0,0,1}));
//    }
//
//    public static boolean canJump(int[] nums) {
//        if(nums == null) return false;
//        if(nums.length <= 1) return true;
//        HashMap<Integer, ArrayList<Integer>> integerArrayListHashMap = new HashMap<>();
//        for (int i = 0; i < nums.length-1; i++) {
//            ArrayList<Integer> results = new ArrayList<>();
//            for (int i1 = 0; i1 < nums[i]; i1++) {
//                results.add((i+i
//            integerArrayListHashMap.put(i,results);
//        }
//
//        int index = 0;
//        int index1 = 0;
//        int currentIndexCollection = 0;
//        while (true){
//            if(integerArrayListHashMap.get(index) == null){
//                index++;
//            }
//            if(integerArrayListHashMap.get(index).contains(nums.length-1)){
//                return true;
//            }else {
//                // pick smallest
//                Integer integer = integerArrayListHashMap.get(index).get(index1);
//                int size = integerArrayListHashMap.get(integer).size();
//                if(size == 0){
//                    while (index1 < Collections.max(integerArrayListHashMap.get(index))){
//                        index1++;
//                         integer = integerArrayListHashMap.get(index).get(index1);
//                         size = integerArrayListHashMap.get(integer).size();
//                        if(size != 0){
//                            break;
//                        }
//                    }
//                }
//                index = integerArrayListHashMap.get(index).get(index1);
//            }
//        }
//    }
//}
