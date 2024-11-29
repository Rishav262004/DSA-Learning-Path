/*

Stock Buy and Sell - Max one Transaction Allowed
Difficulty: EasyAccuracy: 49.33%Submissions: 20K+Points: 2
Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
Input: prices[] = [7, 6, 4, 3, 1]
Output: 0
Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
Input: prices[] = [1, 3, 6, 9, 11]
Output: 10
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].



code :-


class Solution {
    public int maximumProfit(int prices[]) {
        // Check if the array is in decreasing order
        boolean isDecreasing = true;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                isDecreasing = false;
                break;
            }
        }
        if (isDecreasing) {
            return 0;
        }

        // Logic to calculate the maximum profit
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate profit and update maximum profit
            profit = Math.max(profit, prices[i] - minPrice);
        }

        return profit;
    }
}






*/