package easy;

/**  Given a sorted array of distinct integers and a target value, return the index if the target is found.
 *   If not, return the index where it would be if it were inserted in order. You must write an algorithm
 *   with O(log n) runtime complexity.
 *
 *   Constraints:
 *      1 <= nums.length <= 104
 *      -104 <= nums[i] <= 104
 *      nums contains distinct values sorted in ascending order.
 *      -104 <= target <= 104
 */
public class _35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (target <= nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
}
