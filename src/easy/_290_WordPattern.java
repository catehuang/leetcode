package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
public class _290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        // create a mapping between pattern and s
        // read pattern:
        //  if the character in the map -> there's a relationship between pattern and s -> check s
        //  if the character isn't in the map -> add the character into map
        //      make sure the mapping is unique!
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        Set<String> set = new HashSet<>();
        HashMap<Character, String> hashMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char patternKey = pattern.charAt(i);
            String sKey = str[i];
            if (!hashMap.containsKey(patternKey)) {
                // make the value is unique
                if (!set.add(sKey)) {
                    return false;
                }
                hashMap.put(patternKey, sKey);
            } else {
                // find corresponding character x in the s by hashmap
                // is the character x == s.charAt(i) ?
                if (!hashMap.get(patternKey).equals(sKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
