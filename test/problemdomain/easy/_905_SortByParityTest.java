package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _905_SortByParityTest {

    _905_SortByParity sortByParity;

    @BeforeEach
    public void setUp() {
        sortByParity = new _905_SortByParity();
    }

    @Test
    public void sortArrayByParity_case_1() throws Exception {
        int[] nums = new int[] {3, 1, 2, 4};
        int[] expected = new int[] {2, 4, 3, 1};
        assertTrue(Arrays.equals(expected, sortByParity.sortArrayByParity(nums)));
    }

    @Test
    public void sortArrayByParity_case_2() throws Exception {
        int[] nums = new int[] {0};
        int[] expected = new int[] {0};
        assertTrue(Arrays.equals(expected, sortByParity.sortArrayByParity(nums)));
    }
}