package LeetCode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {4,4,4,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curBestPrice = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < curBestPrice) {
                curBestPrice = prices[i];
            } else if (prices[i] > curBestPrice) {
                int profit = prices[i] - curBestPrice;
                if(maxProfit < profit) {
                   maxProfit = profit;
                }
            }

        }

        return maxProfit;
    }
}

//Another solution
//class Solution {
//    public int maxProfit(int[] prices) {
//
//        int max_profit = 0;
//        int min_profit = prices[0];
//
//        for (int price : prices) {
//            min_profit = Math.min(min_profit, price);
//            max_profit = Math.max(price - min_profit, max_profit);
//
//        }
//
//        return max_profit;
//
//    }
//}