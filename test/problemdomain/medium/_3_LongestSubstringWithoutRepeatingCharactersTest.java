package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3_LongestSubstringWithoutRepeatingCharactersTest {

    _3_LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    public void setUp() {
        longestSubstringWithoutRepeatingCharacters = new _3_LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void lengthOfLongestSubstring_case_1() throws Exception {
        String s = "abcabcbb";
        int output = 3;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring_case_2() throws Exception {
        String s = "bbbbb";
        int output = 1;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void lengthOfLongestSubstring_case_3() throws Exception {
        String s = "pwwkew";
        int output = 3;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
}