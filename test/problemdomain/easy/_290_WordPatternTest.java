package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _290_WordPatternTest {

    _290_WordPattern wordPattern;

    @BeforeEach
    public void setUp() {
        wordPattern = new _290_WordPattern();
    }

    @Test
    public void wordPattern_case_1() throws Exception {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean expected = true;
        assertEquals(expected, wordPattern.wordPattern(pattern, s));
    }

    @Test
    public void wordPattern_case_2() throws Exception {
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean expected = false;
        assertEquals(expected, wordPattern.wordPattern(pattern, s));
    }

    @Test
    public void wordPattern_case_3() throws Exception {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        boolean expected = false;
        assertEquals(expected, wordPattern.wordPattern(pattern, s));
    }

    @Test
    public void wordPattern_case_4() throws Exception {
        String pattern = "abba";
        String s = "dog dog dog dog";
        boolean expected = false;
        assertEquals(expected, wordPattern.wordPattern(pattern, s));
    }

    @Test
    public void wordPattern_case_5() throws Exception {
        String pattern = "aaa";
        String s = "aa aa aa aa";
        boolean expected = false;
        assertEquals(expected, wordPattern.wordPattern(pattern, s));
    }
}