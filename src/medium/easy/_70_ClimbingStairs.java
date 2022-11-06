package medium.easy;


import java.math.BigInteger;

/** You are climbing a staircase. It takes n steps to reach the top.
 *  Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *  Constrains: 1 <= n <= 45
 */
public class _70_ClimbingStairs {
    /**
     * Given a staircase, each time you can either climb 1 or 2 steps. How many ways can you climb to the top
     * @param n the number of steps to reach the top of a staircase
     * @return how many ways can you climb to the top
     */
    public int climb(int n)
    {
        int ones = n;
        int twos = 0;
        long possibleWays = 0L;

        possibleWays++; // all ones
        System.out.println("ones * " + ones + " (+1)");

        while (ones > 1)
        {
            ones -= 2;
            twos++;

            // not all one nor all two, the positions can be shuffled
            if (ones * twos == 0)
            {
                possibleWays++; // cannot shuffle
                System.out.println("Ones * " + ones + "; twos * " + twos + " (+1)");
            }
            else
            {
                long tmp = getAllPossibleWays(ones, twos);
                possibleWays += tmp;
                System.out.println("Ones * " + ones + "; twos * " + twos + " (+" + tmp + ")");
            }
        }

        return (int) possibleWays;
    }

    private long getAllPossibleWays(int ones, int twos)
    {
        BigInteger numerator = new BigInteger("1");
        BigInteger denominator;

        if (ones > twos)
        {
            for (int i = ones + twos; i > ones; i--)
            {
                numerator = numerator.multiply(BigInteger.valueOf(i));
            }
            denominator = factorial(twos);
        }
        else
        {
            for (int i = ones + twos; i > twos; i--)
            {
                numerator = numerator.multiply(BigInteger.valueOf(i));
            }
            denominator = factorial(ones);
        }
        return numerator.divide(denominator).longValue();

    }

    private BigInteger factorial(int n) {
        BigInteger results = new BigInteger("1");

        if (n <= 1)
        {
            return results;
        }

        for (int i = 2; i <= n; i++)
        {
            results = results.multiply(BigInteger.valueOf(i));
        }
        return results;
    }
}
