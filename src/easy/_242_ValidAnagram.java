package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given two strings s and t, return true if t is an anagram of s,
 * and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original letters
 * exactly once.
 */
public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return solution_1(s, t);
        // return solution_2(s, t);
    }

    private boolean solution_2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) > 1) {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                } else if (map.get(t.charAt(i)) == 1) {
                    map.remove(t.charAt(i));
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

    private boolean solution_1(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
