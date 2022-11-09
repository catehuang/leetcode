package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _557_ReverseWordsInAStringIIITest {

    private _557_ReverseWordsInAStringIII reverseWordsInAStringIII;

    @BeforeEach
    public void setUp() {
        reverseWordsInAStringIII = new _557_ReverseWordsInAStringIII();
    }

    @Test
    public void reverseWords_case_1() throws Exception {
        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(expected, reverseWordsInAStringIII.reverseWords(s));
    }

    @Test
    public void reverseWords_case_2() throws Exception {
        String s = "God Ding";
        String expected = "doG gniD";
        assertEquals(expected, reverseWordsInAStringIII.reverseWords(s));
    }

    @Test
    public void reverseWords_case_3() throws Exception {
        String s = "s";
        String expected = "s";
        assertEquals(expected, reverseWordsInAStringIII.reverseWords(s));
    }
}