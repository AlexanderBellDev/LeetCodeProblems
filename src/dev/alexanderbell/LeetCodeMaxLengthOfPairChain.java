package dev.alexanderbell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodeMaxLengthOfPairChain {
    public static void main(String[] args) {
        System.out.println(   findLongestChain(new int[][]{new int[]{3,4},new int[]{1,2},new int[]{2,3}}));
    }

    public static int findLongestChain(int[][] pairs) {
        List<Pair> pairList = new ArrayList<>();
        for (int[] pair : pairs) {
            pairList.add(new Pair(pair[0],pair[1]));
        }
        if(pairList.size() <= 1) return 1;
        Collections.sort(pairList);
        Pair currentPair = pairList.get(0);
        int chains = 1;
        for (int i = 1; i < pairList.size(); i++) {
            if(currentPair.right < pairList.get(i).left){
                currentPair.right = Math.max(currentPair.right,pairList.get(i).right);
                chains ++;
            }
        }
        return chains;
    }



    static class Pair implements Comparable<Pair>{
        public int left;
        public int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }


        @Override
        public int compareTo(Pair o) {
            return this.right - o.right;
        }
    }
}
