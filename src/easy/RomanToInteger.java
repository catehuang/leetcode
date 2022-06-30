package easy;

public class RomanToInteger
{
    public int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int number = 0;

        for (int i = 0; i < roman.length; i++)
        {
            if (roman[i] == 'I')
            {
                number++;
            }
            else if (roman[i] == 'V')
            {
                number += 5;
                if (i > 0 && roman[i - 1] == 'I')
                {
                    number -= 2;
                }
            }
            else if (roman[i] == 'X')
            {
                number += 10;
                if (i > 0 && roman[i - 1] == 'I')
                {
                    number -= 2;
                }
            }
            else if (roman[i] == 'L')
            {
                number += 50;
                if (i > 0 && roman[i - 1] == 'X')
                {
                    number -= 20;
                }
            }
            else if (roman[i] == 'C')
            {
                number += 100;
                if (i > 0 && roman[i - 1] == 'X')
                {
                    number -= 20;
                }
            }
            else if (roman[i] == 'D')
            {
                number += 500;
                if (i > 0 && roman[i - 1] == 'C')
                {
                    number -= 200;
                }
            }
            else if (roman[i] == 'M')
            {
                number += 1000;
                if (i > 0 && roman[i - 1] == 'C')
                {
                    number -= 200;
                }
            }
        }
        return number;
    }
}
