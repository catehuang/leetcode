package easy;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        boolean isMatch = false;
        int str_length= 0;

        if (needle.equals(""))
        {
            return 0;
        }
        else if (haystack.contains(needle))
        {
            for (int i = 0; i < haystack.length(); i++)
            {
                if (haystack.charAt(i) == needle.charAt(0))
                {
                    isMatch = true;
                }
                else
                {
                    isMatch = false;
                }

                while (isMatch && str_length < needle.length())
                {
                    if (haystack.charAt(i + str_length) == needle.charAt(str_length))
                    {
                        isMatch = true;
                        str_length++;
                    }
                    else
                    {
                        isMatch = false;
                        str_length = 0;
                    }
                }

                if (str_length == needle.length())
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
