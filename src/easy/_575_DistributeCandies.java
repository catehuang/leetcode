package easy;

import java.util.HashSet;

/**
 * Alice has n candies, where the ith candy is of type candyType[i].
 * Alice noticed that she started to gain weight, so she visited a doctor.
 *
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
 * Alice likes her candies very much, and she wants to eat the maximum number
 * of different types of candies while still following the doctor's advice.
 *
 * Given the integer array candyType of length n, return the maximum number
 * of different types of candies she can eat if she only eats n / 2 of them.
 */
public class _575_DistributeCandies {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i: candyType) {
            if (!hashSet.contains(i)) {
                hashSet.add(i);
                if (hashSet.size() >= max) {
                    return max;
                }
            }
        }
        return hashSet.size() <= max ? hashSet.size() : max;
    }
}
