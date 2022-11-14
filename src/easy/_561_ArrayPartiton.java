package easy;

import java.util.Arrays;

/**
 * Given an integer array nums of 2n integers, group these integers into n pairs
 * (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized.
 * Return the maximized sum.
 */
public class _561_ArrayPartiton {
    public int arrayPairSum(int[] nums) {
        // the max value can help to get the second largest value
        // the third can help to get the fourth value
        // so, just sort numbers from smallest to largest
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            // sum up the even index of value
            sum += nums[i];
        }
        return sum;
    }
}
