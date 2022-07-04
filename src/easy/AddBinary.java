package easy;

import java.util.Arrays;

/**
 * Given two binary strings a and b, return their sum as a binary string
 *
 * Constraints:
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary
{
    public String addBinary(String a, String b)
    {
        int[] x = new int[a.length()];
        int[] y = new int[b.length()];
        int[] z = new int[a.length() + b.length()];
        String str = "";
        int counter = 0;
        int sum;
        boolean isCarry = false;

        // convert to integer and store it to int array
        for (int i = 0; i < a.length(); i++)
        {
            x[i] = a.charAt(i) - 48;
        }
        System.out.println();
        for (int i = 0; i < b.length(); i++)
        {
            y[i] = b.charAt(i) - 48;
        }


        for(int i = 0; i < x.length; i++)
        {
            sum = x[counter];
            if (isCarry)
            {
                sum++;
            }

            // adds the digits from both x and y
            if (i < y.length)
            {
                sum += y[counter];

            }

            switch (sum)
            {
                case 0:
                    z[counter] = 0;
                    isCarry = false;
                    break;
                case 1:
                    z[counter] = 1;
                    isCarry = false;
                    break;
                case 2:
                    z[counter] = 0;
                    isCarry = true;
                    break;
                case 3:
                    z[counter] = 1;
                    isCarry = true;
                default:
                    System.out.println("Error1: something wrong.");
                    break;
            }
            counter++;
        }

        // if y.length > x.length
        if (counter < y.length)
        {
            for (int i = counter; i < y.length; i++)
            {
                sum = y[counter];
                if (isCarry)
                {
                    sum++;
                }
                switch (sum)
                {
                    case 0:
                        z[counter] = 0;
                        isCarry = false;
                        break;
                    case 1:
                        z[counter] = 1;
                        isCarry = false;
                        break;
                    case 2:
                        z[counter] = 0;
                        isCarry = true;
                        break;
                    case 3:
                        z[counter] = 1;
                        isCarry = true;
                    default:
                        System.out.println("Error1: something wrong.");
                        break;
                }
                counter++;
            }
        }

        if (isCarry)
        {
            z[counter] = 1;
        }

        for(int k = counter; k > -1; k--)
        {
            str += z[k];
        }

        return str;
    }
}
