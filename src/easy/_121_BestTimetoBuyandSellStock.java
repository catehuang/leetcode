package easy;

/** You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *  Constraints:
 *      1 <= prices.length <= 10^5
 *      0 <= prices[i] <= 10^4
 */
public class _121_BestTimetoBuyandSellStock {
    /**
     * Find the maximum profit or 0
     * @param prices an integer array that provides the stock prices for each day
     * @return the max profit you can achieve from the given information
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minIndex = 0;
        int maxIndex = 0;

        /*  To have a profit, the sold price(s) after the first day must be higher than the buy price at first day.
            As time goes on, if the price higher than the lowest price (first day), the day is the new lowest day, and
            the highest price is reset. In contrast, if the price is higher than the lowest price, calculate the profit
            and replace the max profit if the calculated profit is higher than record.
         */
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
                maxIndex = i;
            } else if (prices[i] > prices[maxIndex]) {
                maxIndex = i;
                profit = (prices[i] - prices[minIndex] > profit) ? prices[i] - prices[minIndex] : profit;
            }
            //System.out.println(i + " " + minIndex + " " + maxIndex + " " + profit);
        }
        return profit;

//        Too slow, rejected
//        for (int i = 0; i < prices.length; i++)
//            for (int j = i + 1; j < prices.length; j++)
//                if (prices[j] > prices[i])
//                    profit = (prices[j] - prices[i] > profit) ? prices[j] - prices[i] : profit;
//        return profit;
    }
}
