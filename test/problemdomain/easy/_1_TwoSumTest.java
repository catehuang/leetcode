package easy;

import medium.easy._1_TwoSum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1_TwoSumTest
{
    private _1_TwoSum twoSum;

    @BeforeEach
    void setUp()
    {
        this.twoSum = new _1_TwoSum();
    }

    @AfterEach
    void tearDown()
    {
        this.twoSum = null;
    }

    @Test
    void testcase1()
    {
        int[] givenArr = {7, 5, 9, 5};
        int target = 10;
        int[] expected = {1, 3};
        int[] output = this.twoSum.twoSum(givenArr, target);
        assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }

    @Test
    void testcase2()
    {
        int[] givenArr = {0, 5, 9, 0};
        int target = 0;
        int[] expected = {0, 3};
        int[] output = this.twoSum.twoSum(givenArr, target);
        assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }
}