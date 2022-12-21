package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length
 * of the longest palindrome that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class _409_longestPalindrome {
    public int longestPalindrome(String s) {
        // to build a palindrome, there must have duplicate characters
        Set<Character> set = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char key = s.charAt(i);
            // the character is in the set
            // move out the character from set and add 2
            // because I only want to have duplicated characters
            if (set.contains(key))
            {
                counter += 2;
                set.remove(key);
            }
            // the character is not in the set
            else
            {
                set.add(key);
            }
        }
        // can have an extra character to make a palindrome
        if (counter < s.length())
        {
            return counter + 1;
        }
        return counter;
    }
}
