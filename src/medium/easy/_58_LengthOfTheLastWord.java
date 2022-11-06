package medium.easy;

/** Given a string s consisting of words and spaces, return the length of the last word in the string.
 *  A word is a maximal substring consisting of non-space characters only.
 *  Constraints:
 *      1 <= s.length <= 104
 *      s consists of only English letters and spaces ' '.
 *      There will be at least one word in s.
 */
public class _58_LengthOfTheLastWord {
    /**
     * Find the length of the last word from a given string
     * @param s a given string
     * @return the length of the last word
     */
    public int getIndex(String s) {
        boolean isSpace = true;
        int n = 0;

        for (int i = s.length() - 1; i > -1; i--)
        {
            if (s.charAt(i) != ' ')
            {
                if (isSpace == true)
                {
                    // starts to count words
                    isSpace = false;
                    n = 1;
                }
                else
                {
                    // keeping counting words
                    isSpace = false;
                    n++;
                }
            }
            else
            {
                if (isSpace == true)
                {
                    // read a space and this is a space as well
                    isSpace = true;
                    n = 0;
                }
                else
                {
                    // read a word and this is a space
                    isSpace = false;
                    return n;
                }
            }
        }
        return n;
    }
}
