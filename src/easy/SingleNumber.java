package easy;

import java.util.ArrayList;

/*
    Given a non-empty array of integers nums, every element appears twice except for one.
    Find that single one. You must implement a solution with a linear runtime complexity
    and use only constant extra space.
    Constraints:
        1 <= nums.length <= 3 * 104
        -3 * 104 <= nums[i] <= 3 * 104
 */
public class SingleNumber {
    /**
     * Find put which number appears only once
     * @param nums a given non-empty array of integers nums
     * @return the number appears only once
     */
    public int singleNumber(int[] nums) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < nums.length; i++)
        {
            if (list.size() == 0)
                list.add(nums[i]);
            else
            {
                int index = list.indexOf(nums[i]);
                if ( index == -1)
                    list.add(nums[i]);
                else
                    list.remove(index);
            }
        }
        return (int)list.get(0);
    }
}
