package easy;

import medium.easy._9_Palindrome;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _9_PalindromeTest {

    private _9_Palindrome palindrome;

    @BeforeEach
    void setUp() {
        this.palindrome = new _9_Palindrome();
    }

    @AfterEach
    void tearDown() {
        this.palindrome = null;
    }

    @Test
    void testcase1() {
        int x = 121;
        assertTrue(this.palindrome.isPalindrome(x));
    }

    @Test
    void testcase3() {
        int x = -121;
        assertFalse(this.palindrome.isPalindrome(x));
    }

    @Test
    void testcase4() {
        int x = 1231;
        assertFalse(this.palindrome.isPalindrome(x));
    }
}