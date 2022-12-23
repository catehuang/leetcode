package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _53_MaximumSubarrayTest {

    _53_MaximumSubarray maximumSubarray;

    @BeforeEach
    public void setUp() {
        maximumSubarray = new _53_MaximumSubarray();
    }

    @Test
    public void maxSubArray_case1() throws Exception {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        assertEquals(expected, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void maxSubArray_case2() throws Exception {
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void maxSubArray_case3() throws Exception {
        int[] nums = {5,4,-1,7,8};
        int expected = 23;
        assertEquals(expected, maximumSubarray.maxSubArray(nums));
    }
}