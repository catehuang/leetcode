package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _884_UncommonWordsFromTwoSentencesTest {

    _884_UncommonWordsFromTwoSentences uncommonWordsFromTwoSentences;

    @BeforeEach
    public void setUp() {
        uncommonWordsFromTwoSentences = new _884_UncommonWordsFromTwoSentences();
    }

    @Test
    public void uncommonFromSentences_case_1() throws Exception {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] expected = new String[] {"sour","sweet"};
        assertTrue(Arrays.deepEquals(expected, uncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2)));
    }

    @Test
    public void uncommonFromSentences_case_2() throws Exception {
        String s1 = "apple apple";
        String s2 = "banana";
        String[] expected = new String[] {"banana"};
        assertTrue(Arrays.deepEquals(expected, uncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2)));
    }

    @Test
    public void uncommonFromSentences_case_3() throws Exception {
        String s1 = "apple apple apple";
        String s2 = "banana";
        String[] expected = new String[] {"banana"};
        assertTrue(Arrays.deepEquals(expected, uncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2)));
    }

    @Test
    public void uncommonFromSentences_case_4() throws Exception {
        String s1 = "fd kss fd";
        String s2 = "fd fd kss";
        String[] expected = new String[] {};
        assertTrue(Arrays.deepEquals(expected, uncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2)));
    }
}