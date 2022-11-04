package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 */
public class _520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        int uppercase = 0;
        int lowercase = 0;
        boolean capitalized = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                lowercase++;
            }
            else {
                uppercase++;
                if (i == 0) {
                    capitalized = true;
                }
            }
        }
        if (uppercase == word.length()) {
            return true; // all uppercase
        } else if (capitalized && lowercase == word.length() - 1) {
            return true; // capitalized
        } else if (lowercase == word.length()) {
            return true; // all lowercase
        } else {
            return false;
        }
    }
}
