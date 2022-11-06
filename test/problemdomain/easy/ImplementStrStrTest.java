package easy;

import medium.easy.ImplementStrStr;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    private ImplementStrStr strStr;

    @BeforeEach
    void setUp() {
        this.strStr = new ImplementStrStr();
    }

    @AfterEach
    void tearDown() {
        this.strStr = null;
    }

    @Test
    void testcase1() {
        String heystack = "hello";
        String needle = "ll";
        int expected = 2;

        assertEquals(expected, this.strStr.strStr(heystack, needle));
    }

    @Test
    void testcase2() {
        String heystack = "aaaaa";
        String needle = "bba";
        int expected = -1;

        assertEquals(expected, this.strStr.strStr(heystack, needle));
    }

    @Test
    void testcase3() {
        String heystack = "aaaaa";
        String needle = "";
        int expected = 0;

        assertEquals(expected, this.strStr.strStr(heystack, needle));
    }

    @Test
    void testcase4() {
        String heystack = "caaaa";
        String needle = "c";
        int expected = 0;

        assertEquals(expected, this.strStr.strStr(heystack, needle));
    }

    @Test
    void testcase5() {
        String heystack = "cbndfh";
        String needle = "bd";
        int expected = -1;

        assertEquals(expected, this.strStr.strStr(heystack, needle));
    }

    @Test
    void testcase6() {
        String heystack = "cbandfbah";
        String needle = "b";
        int expected = 1;

        assertEquals(expected, this.strStr.strStr(heystack, needle));
    }

    @Test
    void testcase7() {
        String heystack = "mississippi";
        String needle = "issip";
        int expected = 4;

        assertEquals(expected, this.strStr.strStr(heystack, needle));
    }
}