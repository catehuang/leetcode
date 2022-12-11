package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 */
public class _205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        //return solution_1(s, t);

        // a map stores characters mapping between two strings
        HashMap<Character, Character> map = new HashMap<>();
        // a map stores the status which duplicate or not
        HashMap<Character, Boolean> charactersMapped = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char skey = s.charAt(i);
            if (map.containsKey(skey)) {
                // compare the map
                char mapped = map.get(skey);
                if (mapped != t.charAt(i)) {
                    return false;
                }
            } else {
                // create a map between s and t
                // is the character of t mapped before?
                    // no -> create one relationship between s and t and indicate t is mapped
                    // yes -> how come!
                char tkey = t.charAt(i);
                if (charactersMapped.containsKey(tkey)) {
                    return false;
                } else {
                    charactersMapped.put(tkey, true);
                    map.put(skey, tkey);
                }
            }
        }
        return true;
    }

    private boolean solution_1(String s, String t) {
        // loop through all characters of s -> marks the characters which appear more than once
        // for string t -> compare the position where the occurrence more than once to the string s
        HashMap<Character, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hashMap.containsKey(c)) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                hashMap.put(c, tmp);
            } else {
                hashMap.get(c).add(i);
            }
        }

        HashMap<Character, List<Integer>> hashMap2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!hashMap2.containsKey(c)) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                hashMap2.put(c, tmp);
            } else {
                hashMap2.get(c).add(i);
            }
        }
        // compare the value of hashmaps
        HashSet<List<Integer>> set1 = new HashSet<>(hashMap.values());
        HashSet<List<Integer>> set2 = new HashSet<>(hashMap2.values());

        return set1.equals(set2);
    }
}
