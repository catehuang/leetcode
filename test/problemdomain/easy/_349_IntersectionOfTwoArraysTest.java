package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _349_IntersectionOfTwoArraysTest {

    _349_IntersectionOfTwoArrays intersectionOfTwoArrays;

    @BeforeEach
    public void setUp() {
        intersectionOfTwoArrays = new _349_IntersectionOfTwoArrays();
    }

    @Test
    public void intersection_case_1() throws Exception {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        int[] results = intersectionOfTwoArrays.intersection(nums1, nums2);
        Arrays.sort(results);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], results[i]);
        }
    }

    @Test
    public void intersection_case_2() throws Exception {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expected = {4, 9};
        int[] results = intersectionOfTwoArrays.intersection(nums1, nums2);
        Arrays.sort(results);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], results[i]);
        }
    }
}