package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _409_longestPalindromeTest {

    _409_longestPalindrome longestPalindrome;

    @BeforeEach
    public void setUp() {
        longestPalindrome = new _409_longestPalindrome();
    }

    @Test
    public void longestPalindrome_case_1() throws Exception {
        String s = "abccccdd";
        int output = 7;
        assertEquals(output, longestPalindrome.longestPalindrome((s)));
    }

    @Test
    public void longestPalindrome_case_2() throws Exception {
        String s = "a";
        int output = 1;
        assertEquals(output, longestPalindrome.longestPalindrome((s)));
    }
}