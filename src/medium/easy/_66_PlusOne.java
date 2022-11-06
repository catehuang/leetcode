package medium.easy;

/**  You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
 *   of the integer. The digits are ordered from most significant to least significant in left-to-right order.
 *   The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting
 *   array of digits.
 *
 *   Constraints:
 *      1 <= digits.length <= 100
 *      0 <= digits[i] <= 9
 *      digits does not contain any leading 0's.
 */
public class _66_PlusOne
{
    public int[] plusOne(int[] digits) {
        // It's better convert it to string or you'll need to deal with big integer !!
        int n = digits.length;
        int[] arr = new int[n];
        boolean isChaining = false;

        // last digit adds one
        if (digits[n - 1] == 9) {
            arr[n - 1] = 0;
            isChaining = true;
        } else {
            arr[n - 1] = digits[n - 1] + 1;
        }

        for (int i = n - 2; i > -1; i--)
        {
            if (isChaining == true) {
                if (digits[i] == 9) {
                    arr[i] = 0;
                    isChaining = true;
                } else {
                    arr[i] = digits[i] + 1;
                    isChaining = false;
                }
            } else {
                arr[i] = digits[i];
                isChaining = false;
            }
        }

        if (isChaining == true)
        {
            int[] newArr = new int[n + 1];
            newArr[0] = 1;
            for (int i = 0; i < n; i++)
            {
                newArr[i + 1] = arr[i];
            }
            return newArr;
        }
        else {
            return arr;
        }
    }
}
