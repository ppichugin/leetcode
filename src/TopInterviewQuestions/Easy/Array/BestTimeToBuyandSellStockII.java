package topinterviewquestions.easy.array;

/*
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 *
 * Constraints:
 * 1 <= prices.length <= 3 * 10^4
 * 0 <= prices[i] <= 10^4
 */

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockII bestTime = new BestTimeToBuyAndSellStockII();
        System.out.println(bestTime.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // Output: 7
        System.out.println(bestTime.maxProfit(new int[]{1, 2, 3, 4, 5})); // Output: 4
        System.out.println(bestTime.maxProfit(new int[]{7, 6, 4, 3, 1})); // Output: 0
        System.out.println(bestTime.maxProfit(new int[]{0})); // Output: 0
    }

    public int maxProfit(int[] prices) {
        int minPriceBuy = prices[0];
        int maxPriceSell;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPriceBuy) {
                maxPriceSell = prices[i];
                profit += (maxPriceSell - minPriceBuy);
            }
            minPriceBuy = prices[i];
        }
        return profit;
    }
}
