package medium;

import java.util.*;

/**
 * You are given an array of strings of the same length words.
 *
 * In one move, you can swap any two even indexed characters or any two odd indexed characters of
 * a string words[i].
 *
 * Two strings words[i] and words[j] are special-equivalent if after any number of moves,
 * words[i] == words[j].
 *
 * For example, words[i] = "zzxy" and words[j] = "xyzz" are special-equivalent because
 * we may make the moves "zzxy" -> "xzzy" -> "xyzz".
 *
 * A group of special-equivalent strings from words is a non-empty subset of words such that:
 * Every pair of strings in the group are special equivalent, and
 * The group is the largest size possible (i.e., there is not a string words[i] not in the group
 * such that words[i] is special-equivalent to every string in the group).
 * Return the number of groups of special-equivalent strings from words.
 */
public class _893_GroupsOfSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] words) {
        // read words and put sorted odd and even characters into map/set
        Set<String> set = new HashSet<>();
        // length of word is even: number of odd == number of even
        // length of word is odd: number of even = number of odd + 1
        int evenItems;
        int oddItems = words[0].length() / 2;
        if (words[0].length() % 2 == 1) {
            evenItems = oddItems + 1;
        } else {
            evenItems = oddItems;
        }

        Character[] even = new Character[evenItems];
        Character[] odd = new Character[oddItems];

        for (String word: words) {
            for(int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    even[i / 2] = word.charAt(i);
                } else {
                    odd[i / 2] = word.charAt(i);
                }
            }
            Arrays.sort(even);
            Arrays.sort(odd);
            String key = Arrays.toString(even).toString() + Arrays.toString(odd).toString();

            set.add(key);
        }
        return set.size();
    }
}
