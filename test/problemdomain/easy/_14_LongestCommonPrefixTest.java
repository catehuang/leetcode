package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _14_LongestCommonPrefixTest {

    private _14_LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    public void setUp() {
        longestCommonPrefix = new _14_LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix_case_1() throws Exception {
        String[] strs = {"flower","flow","flight"};
        String expected = "fl";
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefix_case_2() throws Exception {
        String[] strs = {"dog","racecar","car"};
        String expected = "";
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefix_case_3() throws Exception {
        String[] strs = {"flower","flow","flowight"};
        String expected = "flow";
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(strs));
    }
}