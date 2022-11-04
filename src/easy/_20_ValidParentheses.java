package easy;

/**  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 *   determine if the input string is valid.
 *
 *   An input string is valid if:
 *      Open brackets must be closed by the same type of brackets.
 *      Open brackets must be closed in the correct order.
 *
 *   Constraints:
 *       1 <= s.length <= 104
 *       s consists of parentheses only '()[]{}'.
 */
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
