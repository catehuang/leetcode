package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class _496_NextGreaterElementITest {

    _496_NextGreaterElementI nextGreaterElementI;

    @BeforeEach
    public void setUp() {
        nextGreaterElementI = new _496_NextGreaterElementI();
    }

    @Test
    public void nextGreaterElement_case_1() throws Exception {
        int[] nums1 = new int[] {4, 1, 2};
        int[] nums2 = new int[] {1, 3, 4, 2};
        int[] expected = new int[] {-1, 3, -1};
        assertTrue(Arrays.equals(expected, nextGreaterElementI.nextGreaterElement(nums1, nums2)));
    }

    @Test
    public void nextGreaterElement_case_2() throws Exception {
        int[] nums1 = new int[] {2, 4};
        int[] nums2 = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {3, -1};
        assertTrue(Arrays.equals(expected, nextGreaterElementI.nextGreaterElement(nums1, nums2)));
    }

    @Test
    public void nextGreaterElement_case_3() throws Exception {
        int[] nums1 = new int[] {1, 3, 5, 2, 4};
        int[] nums2 = new int[] {6, 5, 4, 3, 2, 1, 7};
        int[] expected = new int[] {7 ,7 ,7 ,7 ,7};
        assertTrue(Arrays.equals(expected, nextGreaterElementI.nextGreaterElement(nums1, nums2)));
    }
}