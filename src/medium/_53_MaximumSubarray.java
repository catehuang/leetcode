package medium;


/**
 * Given an integer array nums, find the subarray (A subarray is a contiguous non-empty sequence of elements within an array.)
 *  which has the largest sum and return its sum.
 */
public class _53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // add positive numbers as many as possible
        // sum is negative => clear the sum
        // sum is positive => sum up the numbers
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            sum = sum > 0 ? sum + nums[i] : nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
