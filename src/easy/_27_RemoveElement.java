package easy;

/**  Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 *   The relative order of the elements may be changed. Since it is impossible to change the length of the array
 *   in some languages, you must instead have the result be placed in the first part of the array nums.
 *   More formally, if there are k elements after removing the duplicates, then the first k elements of nums
 *   should hold the final result. It does not matter what you leave beyond the first k elements.
 *   Return k after placing the final result in the first k slots of nums. Do not allocate extra space for
 *   another array. You must do this by modifying the input array in-place with O(1) extra memory.
 *
 *   Constraints:
 *      0 <= nums.length <= 100
 *      0 <= nums[i] <= 50
 *      0 <= val <= 100
 */
public class _27_RemoveElement
{
    public int removeElement(int[] nums, int val)
    {
        int[] arr = new int[nums.length];
        int n = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                arr[n] = nums[i];
                n++;
            }
        }

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = arr[i];
        }
        //return arr;
        return n;
    }
}
