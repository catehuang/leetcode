package easy;

import java.util.*;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        return solution_1(nums);
        // return solution_2(nums);
    }

    private boolean solution_2(int[] nums) {
        // 23ms (beats 50.49%), 54.3mb (93.86%)
        return Arrays.stream(nums).distinct().toArray().length == nums.length? false: true;
    }

    private boolean solution_1(int[] nums) {
        // 19ms (beats 62.48%), 68.3mb (61.89%)
        Set<Integer> set = new HashSet<>();
        for (int i: nums)
        {
            if (!set.add(i))
            {
                return true;
            }
        }
        return false;
    }
}
