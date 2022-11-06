package easy;

import medium.easy._125_ValidPalindrome;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _125_ValidPalindromeTest {

    _125_ValidPalindrome validPalindrome;

    @BeforeEach
    void setUp() {
        this.validPalindrome = new _125_ValidPalindrome();
    }

    @AfterEach
    void tearDown() {
        this.validPalindrome = null;
    }

    @Test
    void isPalindromeTestCase1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(this.validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeTestCase2() {
        String s = "race a car";
        assertFalse(this.validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeTestCase3() {
        String s = " ";
        assertTrue(this.validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeTestCase4() {
        String s = "ab_a";
        assertTrue(this.validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeTestCase5() {
        String s = "0P";
        assertFalse(this.validPalindrome.isPalindrome(s));
    }
}