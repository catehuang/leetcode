package easy;

import java.util.*;

/**
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class _771_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        return solution_1(jewels, stones);
        // return solution_2_worst(jewels, stones);
        // return solution_3(jewels, stones);
    }

    private int solution_3(String jewels, String stones) {
        // better than solution 2
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            if (! hashMap.containsKey(stones.charAt(i))) {
                hashMap.put(stones.charAt(i), 1);
            } else {
                hashMap.replace(stones.charAt(i), hashMap.get(stones.charAt(i)) + 1);
            }
        }
        int num = 0;
        for (int i = 0; i < jewels.length(); i++) {
            if (hashMap.containsKey(jewels.charAt(i))) {
                num += hashMap.get(jewels.charAt(i));
            }
        }
        return num;
    }

    private int solution_2(String jewels, String stones) {
        // slow
        // replace stones by jewel characters
        int numOfStones = stones.length();
        for (int i = 0; i < jewels.length(); i++) {
            stones = stones.replaceAll(jewels.substring(i, i+1), "");
        }
        return numOfStones - stones.length();
    }

    private int solution_1(String jewels, String stones) {
        int num = 0;
        Set<Character> hashSet = new HashSet<>();
        for (char c: jewels.toCharArray()) {
            hashSet.add(c);
        }

        for (char c: stones.toCharArray()) {
            if (hashSet.contains(c)) {
                num++;
            }
        }
        return num;
    }
}
