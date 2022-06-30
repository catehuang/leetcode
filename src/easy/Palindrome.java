package easy;

public class Palindrome
{
    public boolean isPalindrome(int x)
    {
        char[] nums = String.valueOf(x).toCharArray();

        int middle = nums.length / 2;

        for (int i = 0; i < middle; i++)
        {
            if (nums[i] != nums[nums.length - i - 1])
            {
                return false;
            }
        }
        return true;
    }
}
