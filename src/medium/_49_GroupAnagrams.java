package medium;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of
 * a different word or phrase, typically using all the original letters
 * exactly once.
 */
public class _49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        List<List<String>> results = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        // re-order characters of each word by alphabet and store the word into map
        for (String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            // c.toString is wrong
            String key = Arrays.toString(c);
            // key doesn't exist then create an entry
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            results.add(entry.getValue());
        }

        return results;
    }
}
