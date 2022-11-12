package easy;

import common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, move all the even integers at the beginning of
 * the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 */
public class _905_SortByParity {
    public int[] sortArrayByParity(int[] nums) {
        int firstIndexOfOdd = -1;

        // walk through all numbers in the array
        // if the number is even, swap it to the left of the first odd number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (firstIndexOfOdd != -1 && i > firstIndexOfOdd) {
                    int tmp = nums[firstIndexOfOdd];
                    nums[firstIndexOfOdd] = nums[i];
                    nums[i] = tmp;
                    firstIndexOfOdd++;
                }
            }
            else {
                if (firstIndexOfOdd == -1) {
                    firstIndexOfOdd = i;
                }
            }
        }
        return nums;
    }
}
