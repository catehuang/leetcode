package easy;

import java.util.*;

/**
 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 */
public class _884_UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        // combine s1 and s2, then sort them
        String[] str = (s1 + " " + s2).split(" ");
        Arrays.sort(str);

        return solution_1(str); // speed beats 35%; memory beats 76%
        // return solution_2(str); // speed beats 17%; memory beats 12%

    }

    private String[] solution_2(String[] str) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s: str) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }
        String results = new String();
        for (Map.Entry<String, Integer> set: hashMap.entrySet()) {
            if (set.getValue() == 1) {
                if (results.length() == 0) {
                    results = set.getKey();
                } else {
                    results += " " + set.getKey();
                }
            }
        }
        System.out.println(results);

        if (results.length() == 0) {
            return new String[]{};
        } else {
            return results.split(" ");
        }
    }

    private String[] solution_1(String[] str) {
        int lastIndex = 0;
        String results = null;
        for (int i = 1; i < str.length; i++) {
            if (!str[i].equals(str[i - 1])) {
                if (lastIndex == i - 1) {
                    if (results == null) {
                        results = str[i - 1];
                    } else {
                        results += " " + str[i - 1];
                    }
                }
                lastIndex = i;
            }
        }
        if (!Objects.equals(str[str.length - 1], str[str.length - 2])) {
            if (results == null) {
                results = str[str.length - 1];
            } else {
                results += " " + str[str.length - 1];
            }
        }

        System.out.println(results);
        if (results != null) {
            return results.split(" ");
        }
        return new String[]{};
    }
}
