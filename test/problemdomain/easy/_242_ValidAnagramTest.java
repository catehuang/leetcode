package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _242_ValidAnagramTest {

    _242_ValidAnagram validAnagram;

    @BeforeEach
    public void setUp() {
        validAnagram = new _242_ValidAnagram();
    }

    @Test
    public void isAnagram_case_1() throws Exception {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    public void isAnagram_case_2() throws Exception {
        String s = "rat";
        String t = "car";
        assertFalse(validAnagram.isAnagram(s, t));
    }
}