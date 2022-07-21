package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimetoBuyandSellStockTest {

    BestTimetoBuyandSellStock bestTimetoBuyandSellStock;

    @BeforeEach
    void setUp() {
        this.bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
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
}