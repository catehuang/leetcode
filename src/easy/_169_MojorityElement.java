package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class _169_MojorityElement {
    public int majorityElement(int[] nums) {
        // 10ms (beats 50.84%), 47.4mb (beats 79.56%)
        //return solution_1(nums);

        // 3ms (beats 78.89%), 45.8mb (beats 90.46%)
        // sort numbers, find the range of each number
        Arrays.sort(nums);
        int len = nums.length;
        int firstIndex = 0;
        int maxFrequency = 0;
        int value = nums[0];
        if (len == 1)
        {
            return nums[0];
        }
        for (int i = 1; i < len; i++)
        {
            // the number != previous one
            if (nums[i] != nums[i - 1])
            {
                // the previous number has nth
                // if the frequency of number is greater than the record => update the record including the frequency and value
                if (i - firstIndex + 1 > maxFrequency)
                {
                    maxFrequency = i - firstIndex;
                    value = nums[i - 1];
                }
                // update the first index of this range for the specific number
                firstIndex = i;
            }
        }

        // deal with the last range if the number is the same as the previous one
        if (nums[len - 2] == nums[len - 1]) {
            if (len - 1 - firstIndex + 1 > maxFrequency)
            {
                maxFrequency = len - 1 - firstIndex;
                value = nums[len - 1];
            }
        }
        else
        {
            // the last number is not belong to the previous range
            // deal with the previous range and the last one is just one item
            if (len - 2 - firstIndex + 1 > maxFrequency)
            {
                maxFrequency = len - 2 - firstIndex + 1;
                value = nums[len - 2 - 1];
            }
        }

        return value;
    }

    private int solution_1(int[] nums) {
        // store them into map
        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequncy = 0;
        int freqency = 0;
        int value = 0;
        for (int num: nums)
        {
            if (map.containsKey(num))
            {
                freqency = map.get(num) + 1;
                map.put(num, freqency);
                if (freqency > maxFrequncy)
                {
                    maxFrequncy = freqency;
                    value = num;
                }
            }
            else
            {
                map.put(num, 1);
            }
        }
        // no duplicate number => only one number in the array
        if (value == 0) {
            value = nums[0];
        }
        return value;
    }
}
