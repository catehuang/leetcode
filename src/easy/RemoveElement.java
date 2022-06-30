package easy;

public class RemoveElement
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
