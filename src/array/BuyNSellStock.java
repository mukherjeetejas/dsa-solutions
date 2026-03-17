package array;

public class BuyNSellStock {
    /*
    Problem: Best Time to Buy and Sell Stock
    Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    Difficulty: Easy

    Approach 1:
    - Right to left. We calculate profit
    - We make sure to have the highest selling point

    Approach 2 (Recommended):
    - Left to right. We calculate profit from day 2
    - We also calculate minimum so far, to get best buying point

    Time Complexity: O(n)
    Space Complexity: O(1)
    */
    public int maxProfit_attempt1(int[] prices) {
        if (prices.length == 1) return 0;
        int max_profit = 0;
        int diff=prices[prices.length-1]-prices[prices.length-2];
        int sp=prices[prices.length-1];
        for (int i=prices.length-2;i>=0;i--) {
            diff = sp - prices[i];
            if (prices[i] > sp) sp = prices[i];
            max_profit = Math.max(max_profit, diff);
        }
        return max_profit;
    }

    public int maxProfit(int[] prices) {
        int max_profit = 0; int min = prices[0];
        for (int i=1;i<prices.length;i++) {
            int profit = prices[i] - min;
            min = Math.min(prices[i], min);
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }
}
