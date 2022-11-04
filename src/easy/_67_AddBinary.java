package easy;

import java.util.Arrays;

/** Given two binary strings a and b, return their sum as a binary string
 *  Constraints:
 *      1 <= a.length, b.length <= 104
 *      a and b consist only of '0' or '1' characters.
 *      Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {
    /**
     * Given two binary strings a and b, return their sum as a binary string.
     * @param a a binary string
     * @param b another binary string
     * @return the sum of two binary numbers (in string format)
     */
    public String addBinary(String a, String b) {

        /*
            Convert each bit from right to left.
            Tried converting string to number and suffered big integer related converting.
         */
        char[] str = new char[Math.max(a.length(), b.length()) + 1];
        String result = "";
        boolean isCarry = false;
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            if (isCarry) {
                sum = 1;
            } else {
                sum = 0;
            }

            if (i < a.length()) {
                sum += a.charAt(a.length() - i - 1) - 48;
            }

            if (i < b.length()) {
                sum += b.charAt(b.length() - i - 1) - 48;
            }

            switch (sum) {
                case 0:
                    str[i] = '0';
                    isCarry = false;
                    break;
                case 1:
                    str[i] = '1';
                    isCarry = false;
                    break;
                case 2:
                    str[i] = '0';
                    isCarry = true;
                    break;
                case 3:
                    str[i] = '1';
                    isCarry = true;
                    break;
                default:
                    System.out.println("Error1: something wrong.");
                    break;
            }
        }

        boolean effective = false;

        for (int k = str.length - 1; k > -1; k--)
        {
            if (str[k] == '1' && effective == false)
            {
                effective = true;
            }

            if (effective)
            {
                result += str[k];
            }
        }

        if (result == "")
        {
            result = "0";
        }

        return result;


        //return method1(a, b);
    }

    private String method1(String a, String b)
    {
        int[] x = new int[a.length()];
        int[] y = new int[b.length()];
        int[] z = new int[a.length() + b.length()];
        String str = "";
        int counter = 0;
        int sum = 0;
        boolean isCarry = false;

        // convert to integer and store it to int array
        for (int i = 0; i < a.length() ; i++)
        {
            x[a.length() - i - 1] = a.charAt(i) - 48;
        }
        System.out.println();
        for (int i = 0; i < b.length() ; i++)
        {
            y[b.length() - i - 1] = b.charAt(i) - 48;
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
                    break;
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
                        break;
                    default:
                        System.out.println("Error2: something wrong.");
                        break;
                }
                counter++;
            }
        }

        if (isCarry)
        {
            z[counter++] = 1;
        }

        for(int k = counter - 1; k > -1; k--)
        {
            str += z[k];
        }
        //System.out.println("output = " + str);
        return str;
    }
}
