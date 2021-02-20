package dev.alexanderbell;

import java.util.HashSet;

public class LeetCodeJewelsAndStones {
    public static void main(String[] args) {

    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        int total = 0;
        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if(jewelSet.contains(stones.charAt(i))) total ++;
        }
        return total;
    }
}
