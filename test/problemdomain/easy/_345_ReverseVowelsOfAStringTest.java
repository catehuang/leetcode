package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _345_ReverseVowelsOfAStringTest {

    private  _345_ReverseVowelsOfAString reverseVowelsOfAString;

    @BeforeEach
    public void setUp() {
        reverseVowelsOfAString = new _345_ReverseVowelsOfAString();
    }

    @Test
    public void reverseVowels_case_1() throws Exception {
        String s = "hello";
        String expected = "holle";
        assertEquals(expected, reverseVowelsOfAString.reverseVowels(s));
    }

    @Test
    public void reverseVowels_case_2() throws Exception {
        String s = "leetcode";
        String expected = "leotcede";
        assertEquals(expected, reverseVowelsOfAString.reverseVowels(s));

    }

    @Test
    public void reverseVowels_case_3() throws Exception {
        String s = "aattcode";
        String expected = "eottcada";
        assertEquals(expected, reverseVowelsOfAString.reverseVowels(s));
    }

    @Test
    public void reverseVowels_case_4() throws Exception {
        String s = "aeioubcd";
        String expected = "uoieabcd";
        assertEquals(expected, reverseVowelsOfAString.reverseVowels(s));
    }

    @Test
    public void reverseVowels_case_5() throws Exception {
        String s = "abcAEIOU";
        String expected = "UbcOIEAa";
        assertEquals(expected, reverseVowelsOfAString.reverseVowels(s));
    }
    @Test
    public void reverseVowels_case_6() throws Exception {
        String s = ".,";
        String expected = ".,";
        assertEquals(expected, reverseVowelsOfAString.reverseVowels(s));
    }
}