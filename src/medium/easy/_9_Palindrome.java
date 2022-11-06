package medium.easy;

/**  A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 *   removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters
 *   include letters and numbers. Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *   Constraints:
 *      1 <= s.length <= 2 * 105
 *      s consists only of printable ASCII characters.
 */
public class _9_Palindrome
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
