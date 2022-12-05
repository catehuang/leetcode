package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _575_DistributeCandiesTest {

    _575_DistributeCandies distributeCandies;

    @BeforeEach
    public void setUp() {
        distributeCandies = new _575_DistributeCandies();
    }

    @Test
    public void distributeCandies_case_1() throws Exception {
        int[] candyType = new int[] {1, 1, 2, 2, 3, 3};
        int expected = 3;
        assertEquals(expected, distributeCandies.distributeCandies(candyType));
    }

    @Test
    public void distributeCandies_case_2() throws Exception {
        int[] candyType = new int[] {1, 1, 2, 3};
        int expected = 2;
        assertEquals(expected, distributeCandies.distributeCandies(candyType));
    }

    @Test
    public void distributeCandies_case_() throws Exception {
        int[] candyType = new int[] {6, 6, 6, 6};
        int expected = 1;
        assertEquals(expected, distributeCandies.distributeCandies(candyType));
    }
}