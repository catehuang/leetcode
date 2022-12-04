package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
public class _202_HappyNumber {
    public boolean isHappy(int n) {

        List<Integer> list = new ArrayList<>();
        // need to deal with more than one digit
        while (n > 9) {
            list = splitDigits(n);

            n = 0;
            for (Integer i: list) {
                n += Math.pow(i, 2);
            }
        }
        return n == 1 || n == 7;
        //1 2 3  4  5  6  7  8  9 n
        //1 4 9 16 25 36 49 64 81 n^2
        //      37 29 45 97 52 65
        //      58 (4) 41 130 29 61
        //      89 (4) 17 10 (4) 37
        //      145(4) 50 1 (4) 58
        //      42 (4) 25 1 (4) (4)
        //      20
        //      4
    }

    private List<Integer> splitDigits(int n) {
        List<Integer> listTmp = new ArrayList<>();
        // add each digit into list
        if (n > 9) {
            while (n/10 >= 1) {
                listTmp.add(n % 10);
                n /= 10;
            }
        }

        listTmp.add(n);
        return listTmp;
    }
}
