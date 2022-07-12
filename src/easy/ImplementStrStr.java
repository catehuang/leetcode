package easy;

/** Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 *  or -1 if needle is not part of haystack.
 *
 * Clarification:
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 * This is consistent to C's strstr() and Java's indexOf().
 *
 * Constraints:
 *      1 <= haystack.length, needle.length <= 104
 *      haystack and needle consist of only lowercase English characters.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        boolean isMatch = false;
        int str_length= 0;

        if (needle.equals(""))
        {
            return 0;
        }
        else if (haystack.contains(needle))
        {
            for (int i = 0; i < haystack.length(); i++)
            {
                if (haystack.charAt(i) == needle.charAt(0))
                {
                    isMatch = true;
                }
                else
                {
                    isMatch = false;
                }

                while (isMatch && str_length < needle.length())
                {
                    if (haystack.charAt(i + str_length) == needle.charAt(str_length))
                    {
                        isMatch = true;
                        str_length++;
                    }
                    else
                    {
                        isMatch = false;
                        str_length = 0;
                    }
                }

                if (str_length == needle.length())
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
