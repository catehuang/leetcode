package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _121_BestTimetoBuyandSellStockTest {

    _121_BestTimetoBuyandSellStock bestTimetoBuyandSellStock;

    @BeforeEach
    void setUp() {
        this.bestTimetoBuyandSellStock = new _121_BestTimetoBuyandSellStock();
    }

    @AfterEach
    void tearDown() {
        this.bestTimetoBuyandSellStock = null;
    }

    @Test
    void maxProfitTest1() {
        int[] prices = new int[] {7,1,5,3,6,4};
        int expected = 5;

        assertEquals(expected, this.bestTimetoBuyandSellStock.maxProfit(prices));
    }

    @Test
    void maxProfitTest2() {
        int[] prices = new int[] {7,6,4,3,1};
        int expected = 0;

        assertEquals(expected, this.bestTimetoBuyandSellStock.maxProfit(prices));
    }

    @Test
    void maxProfitTest3() {
        int[] prices = new int[] {1, 2};
        int expected = 1;

        assertEquals(expected, this.bestTimetoBuyandSellStock.maxProfit(prices));
    }

    @Test
    void maxProfitTest4() {
        int[] prices = new int[] {7,1,5,3,6,4, 4,56,88,66,4,1,2,5,0,5,6,65,8,52,75,3,44,5,1,5,845,514,8,1,21,0};
        int expected = 845;

        assertEquals(expected, this.bestTimetoBuyandSellStock.maxProfit(prices));
    }
}