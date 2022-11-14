package easy;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s,
 * and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original letters
 * exactly once.
 */
public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
