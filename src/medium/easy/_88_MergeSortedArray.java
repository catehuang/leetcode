package medium.easy;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead
 * be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * Constraints:
 *      nums1.length == m + n
 *      nums2.length == n
 *      0 <= m, n <= 200
 *      1 <= m + n <= 200
 *      -109 <= nums1[i], nums2[j] <= 109
 */
public class _88_MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int counter = nums1.length - 1;

        if (a == -1 && b == -1)
        {
            return nums1 = new int[]{0};
        }
        else if (a == -1)
        {
            for (int i = 0; i < nums1.length; i++)
            {
                nums1[i] = nums2[i];
            }
            return nums1;
        }
        else if (b == -1)
        {
            return nums1;
        }

        while (counter > -1)
        {
            if (a > -1 && b > -1)
            {
                if (nums1[a] >= nums2[b])
                {
                    nums1[counter] = nums1[a];
                    a--;
                } else
                {
                    nums1[counter] = nums2[b];
                    b--;
                }
            }
            else if (a > -1)
            {
                nums1[counter] = nums1[a];
                a--;
            }
            else if (b > -1)
            {
                nums1[counter] = nums2[b];
                b--;
            }
            counter--;
        }

//        for (int i: nums1)
//        {
//            System.out.print(i + " ");
//        }
        return nums1;
    }
}
