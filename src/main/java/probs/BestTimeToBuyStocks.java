package main.java.probs;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class BestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println(maxProfitBruteForce(prices));
        System.out.println(maxProfitOptimised(prices));
        System.out.println(maxProfitTwoPointer(prices));

    }

    private static int maxProfitOptimised(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (maxProfit < prices[i] - buy) {
                maxProfit = prices[i] - buy;
            }
        }
        return maxProfit;
    }

    private static int maxProfitTwoPointer(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                //profit
                int currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(currentProfit, maxProfit);
                right++;
            } else {
                //loss -> skip
                left = right;
                right++;
            }
        }
        return maxProfit;

    }

    private static int maxProfitBruteForce(int[] prices) {
        int len = prices.length;
        //brute force o(n2)
        TreeSet<Integer> profits = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int profit = prices[j] - prices[i];
                profits.add(profit);
            }
        }
        int maxProfit = profits.iterator().next();
        return maxProfit > 0 ? maxProfit : 0;
    }
}
