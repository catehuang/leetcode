package easy;

import java.util.*;

/**
 * The next greater element of some element x in an array is the first greater element
 * that is to the right of x in the same array.
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and
 * determine the next greater element of nums2[j] in nums2.
 * If there is no next greater element, then the answer for this query is -1.
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */
public class _496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return solution_slow(nums1,nums2);
    }

    private int[] solution_slow(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m];
        List<Integer> list = new ArrayList<>();

        for (int j : nums2) {
            list.add(j);
        }

        for (int i = 0; i < m; i++) {
            int index = list.indexOf(nums1[i]);
            boolean isDone = false;
            // find the next larger value
            while (!isDone && index + 1 < n) {
                if (list.get(index + 1) > nums1[i]) {
                    isDone = true;
                    result[i] = list.get(index + 1);
                } else {
                    index++;
                }
            }
            if (!isDone) {
                result[i] = -1;
            }
        }

        return result;
    }
}
