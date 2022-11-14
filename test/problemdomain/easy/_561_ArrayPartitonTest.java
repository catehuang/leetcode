package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _561_ArrayPartitonTest {

    _561_ArrayPartiton arrayPartiton;

    @BeforeEach
    public void setUp() {
        arrayPartiton = new _561_ArrayPartiton();
    }

    @Test
    public void arrayPairSum_case_1() throws Exception {
        int[] nums = new int[] {1, 4, 3, 2};
        int expected = 4;
        assertEquals(expected, arrayPartiton.arrayPairSum(nums));
    }

    @Test
    public void arrayPairSum_case_2() throws Exception {
        int[] nums = new int[] {6, 2, 6, 5, 1, 2};
        int expected = 9;
        assertEquals(expected, arrayPartiton.arrayPairSum(nums));
    }
}