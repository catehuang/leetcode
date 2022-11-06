package easy;

import medium.easy._88_MergeSortedArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _88_MergeSortedArrayTest {

    private _88_MergeSortedArray mergeSortedArray;

    @BeforeEach
    void setUp() {
        this.mergeSortedArray = new _88_MergeSortedArray();
    }

    @AfterEach
    void tearDown() {
        this.mergeSortedArray = null;
    }

    @Test
    void testcase1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] output = this.mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], output[i]);
        }
    }

    @Test
    void testcase2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = null;
        int n = 0;
        int[] expected = {1};
        int[] output = this.mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], output[i]);
        }
    }

    @Test
    void testcase3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        int[] output = this.mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], output[i]);
        }
    }

    @Test
    void testcase4() {
        int[] nums1 = {1, 2, 4, 0, 0};
        int m = 3;
        int[] nums2 = {3, 5};
        int n = 2;
        int[] expected = {1, 2, 3, 4, 5};
        int[] output = this.mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], output[i]);
        }
    }

    @Test
    void testcase5() {
        int[] nums1 = {1, 3, 0, 0, 0};
        int m = 2;
        int[] nums2 = {1, 2, 2};
        int n = 3;
        int[] expected = {1, 1, 2, 2, 3};
        int[] output = this.mergeSortedArray.merge(nums1, m, nums2, n);

        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], output[i]);
        }
    }
}