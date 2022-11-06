package medium.easy;

/**
    Write a function that reverses a string. The input string is given as an array of characters s.
    You must do this by modifying the input array in-place with O(1) extra memory.
 **/
public class _344_ReverseString {
    public char[] reverseString(char[] s) {
        char c = '\000';
        for (int i = 0; i < s.length/2; i++) {
            c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }
        return s;
    }
}
