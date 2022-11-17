package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _844_BackspaceStringCompareTest {

    _844_BackspaceStringCompare backspaceStringCompare;

    @BeforeEach
    public void setUp() {
        backspaceStringCompare = new _844_BackspaceStringCompare();
    }

    @Test
    public void backspaceCompare_case_1() throws Exception {
        String s = "ab#c";
        String t = "ad#c";
        boolean expected = true;
        assertEquals(expected, backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void backspaceCompare_case_2() throws Exception {
        String s = "ab##";
        String t = "c#d#";
        boolean expected = true;
        assertEquals(expected, backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void backspaceCompare_case_3() throws Exception {
        String s = "a#c";
        String t = "b";
        boolean expected = false;
        assertEquals(expected, backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void backspaceCompare_case_4() throws Exception {
        String s = "a##c";
        String t = "#a#c";
        boolean expected = true;
        assertEquals(expected, backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void backspaceCompare_case_5() throws Exception {
        String s = "bxj##tw";
        String t = "bxj###tw";
        boolean expected = false;
        assertEquals(expected, backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void backspaceCompare_case_6() throws Exception {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        boolean expected = true;
        assertEquals(expected, backspaceStringCompare.backspaceCompare(s, t));
    }
}