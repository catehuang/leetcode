package easy;

/** You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *  Constraints:
 *      1 <= prices.length <= 10^5
 *      0 <= prices[i] <= 10^4
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minIndex = 0;
        int maxIndex = 0;

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
