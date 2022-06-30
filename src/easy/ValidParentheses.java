package easy;

public class ValidParentheses {
    public boolean isValid(String s)
    {
        char[] c = s.toCharArray();
        char[] stack = new char[c.length];
        // store the index of stack
        int n = -1;

        if (c.length % 2 == 1)
        {
            return false;
        }

        for (int i = 0; i < c.length; i++)
        {
            if (c[i] == '(' || c[i] == '{' || c[i] == '[')
            {
                n++;
                if (c[i] == '(')
                {
                    stack[n] = ')';
                }
                else if (c[i] == '{')
                {
                    stack[n] = '}';
                }
                else if (c[i] == '[')
                {
                    stack[n] = ']';
                }
            }
            else
            {
                if (n > -1 && stack[n] == c[i])
                {
                    n--;
                }
                else
                {
                    return false;
                }
            }
        }

        if (n == -1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
