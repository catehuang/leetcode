package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */
public class _349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i: nums1) {
            if (!hashSet.contains(i)) {
                hashSet.add(i);
            }
        }
        int prev = -1;
        List<Integer> matches = new ArrayList<>();
        for (Integer i: nums2) {
            if (hashSet.contains(i) && i != prev) {
                matches.add(i);
            }
            prev = i;
        }

        int[] results = new int[matches.size()];
        for (int i = 0; i < matches.size(); i++) {
            results[i] = matches.get(i);
        }

        return results;
    }
}
