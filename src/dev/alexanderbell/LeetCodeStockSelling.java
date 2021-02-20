package dev.alexanderbell;

import java.util.HashMap;

public class LeetCodeStockSelling {
    static HashMap<Integer, Integer> sums = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4, 50}));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > maxProfit){
                    maxProfit = prices[i] - min;
                }
            }
        return maxProfit;
    }
}
