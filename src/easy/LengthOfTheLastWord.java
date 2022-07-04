package easy;

import java.util.Arrays;

public class LengthOfTheLastWord {
    public int getIndex(String s) {
        boolean isSpace = true;
        int n = 0;

        for (int i = s.length() - 1; i > -1; i--)
        {
            if (s.charAt(i) != ' ')
            {
                if (isSpace == true)
                {
                    // starts to count words
                    isSpace = false;
                    n = 1;
                }
                else
                {
                    // keeping counting words
                    isSpace = false;
                    n++;
                }
            }
            else
            {
                if (isSpace == true)
                {
                    // read a space and this is a space as well
                    isSpace = true;
                    n = 0;
                }
                else
                {
                    // read a word and this is a space
                    isSpace = false;
                    return n;
                }
            }
        }
        return n;
    }
}