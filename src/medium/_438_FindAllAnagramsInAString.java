package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class _438_FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        char[] a = p.toCharArray();
        Arrays.sort(a);
        char[] tmp = new char[n];
        List<Integer> result = new ArrayList<>();

        //group n items in s to compare to p, n = the length of p
        for (int i = 0; i < s.length() - n + 1; i++) {
            for (int j = 0; j < n; j++) {
                tmp[j] = s.charAt(i + j);
            }
            Arrays.sort(tmp);
            if (Arrays.equals(tmp, a)) {
                result.add(i);
            }
        }
        return result;
    }
}
