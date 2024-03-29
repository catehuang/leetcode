package medium;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */
public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list;
        int sum = 0, twoSum = 0;
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        Collections.sort(numList);

        if (numList.size() < 3) {
            return new ArrayList<>();
        }
        else if (numList.size() == 3) {
            for (int i: numList) {
                sum += i;
            }
            if (sum == 0) {
                output.add(numList);
                return output;
            }
            else {
                return new ArrayList<>();
            }
        }
        for (int i = 0; i < numList.size() - 1; i++) {
            int start = i + 1;
            int end = numList.size() - 1;
            while (start < end) {
                sum = numList.get(i) + numList.get(start) + numList.get(end);
                if (sum == 0) {
                    list = new ArrayList<>();
                    list.add(numList.get(i));
                    list.add(numList.get(start));
                    list.add(numList.get(end));
                    Collections.sort(list);
                    if (!output.contains(list)){
                        output.add(list);
                    }
                    while (start < end && Objects.equals(numList.get(start), numList.get(start + 1))) {
                        start++;
                    }
                    if (start < end) {
                        start++;
                    }
                    if (start > end) {
                        end--;
                    }
                } else {
                    if (sum > 0) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
/*
        for (int i = 0; i < numList.size() - 2; i++) {
            sum = numList.get(i);
            for (int j = i + 1; j < numList.size() - 1; j++) {
                twoSum = sum + numList.get(j);
                int index = numList.lastIndexOf(-twoSum);
                if (index != -1 && index > i && index > j) {
                    list = new ArrayList<>();
                    list.add(numList.get(i));
                    list.add(numList.get(j));
                    list.add(numList.get(index));
                    Collections.sort(list);
                    if (!output.contains(list)){
                        output.add(list);
                    }
                }
            }
        }
 */
        return output;
    }
}
