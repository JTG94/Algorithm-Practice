package leetcode;

/**
 * Date : 2021.06.26
 * Title : Best Time to Buy and Sell Stock (https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
 * Difficulty : Easy
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(price - min, max);
        }
        return max;
    }   
}