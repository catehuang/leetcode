package easy;

/** A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 *  and removing all non-alphanumeric characters, it reads the same forward and backward.
 *  Alphanumeric characters include letters and numbers.
 *  Constraints:
 *      1 <= s.length <= 2 * 10^5
 *      s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
    /**
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * @param s a given string
     * @return false if it is not a palindrome
     */
    public boolean isPalindrome(String s) {
        /* Too slow : faster than 7.83% Java submissions
        String str = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        return true;
         */
        String str = s.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right)
        {
            // a-z ascii code = 97-122, 0 - 9 is in the range of 48-57
            if (((str.charAt(left) > 47 && str.charAt(left) < 58) || (str.charAt(left) > 96 && str.charAt(left) < 123)) &&
            ((str.charAt(right) > 47 && str.charAt(right) < 58) || (str.charAt(right) > 96 && str.charAt(right) < 123)))
            {
                if (str.charAt(left) == str.charAt(right))
                {
                    left++;
                    right--;
                }
                else
                    return false;
            }
            else
            {
                if ((str.charAt(left) < 48 || str.charAt(left)> 122) || (str.charAt(left) > 57 && str.charAt(left) < 97))
                    left++;
                if ((str.charAt(right) < 48 || str.charAt(right)> 122) || (str.charAt(right) > 57 && str.charAt(right) < 97))
                    right--;
            }
        }
        return true;
    }
}
