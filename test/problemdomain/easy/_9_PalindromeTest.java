package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    void setUp() {
        this.palindrome = new Palindrome();
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