package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _438_FindAllAnagramsInAStringTest {

    _438_FindAllAnagramsInAString findAllAnagramsInAString;

    @BeforeEach
    public void setUp() {
        findAllAnagramsInAString = new _438_FindAllAnagramsInAString();
    }

    @Test
    public void findAnagrams_case_1() throws Exception {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(6);
        assertEquals(expected, findAllAnagramsInAString.findAnagrams(s, p));
    }

    @Test
    public void findAnagrams_case_2() throws Exception {
        String s = "abab";
        String p = "ab";
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        assertEquals(expected, findAllAnagramsInAString.findAnagrams(s, p));
    }
}