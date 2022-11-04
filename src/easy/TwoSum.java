package easy;

/** Given an array of integers nums and an integer target, return indices of the two numbers such
 *  that they add up to target. You may assume that each input would have exactly one solution, and you
 *  may not use the same element twice. You can return the answer in any order.
 *
 *  Constraints:
 *      2 <= nums.length <= 104
 *      -109 <= nums[i] <= 109
 *      -109 <= target <= 109
 *      Only one valid answer exists.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[j] <= target) {
                    if (nums[i] + nums[j] == target)
                    {
                        int[] arr = {i, j};
                        return arr;
                    }
                }

            }
        }
        return null;
    }
}
