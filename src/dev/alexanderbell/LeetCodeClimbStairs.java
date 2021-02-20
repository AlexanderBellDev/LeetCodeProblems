package dev.alexanderbell;

import java.util.HashMap;

public class LeetCodeClimbStairs {

    static HashMap<Integer, Integer> totalWaysToMakeEachStep = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (!totalWaysToMakeEachStep.containsKey(n)) {
            if (n <= 2) {
                return n;
            } else {
                totalWaysToMakeEachStep.put(n, climbStairs(n - 1) + climbStairs(n - 2));
            }
        }
        return totalWaysToMakeEachStep.get(n);
    }
}
