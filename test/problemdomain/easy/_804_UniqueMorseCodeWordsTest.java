package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _804_UniqueMorseCodeWordsTest {

    _804_UniqueMorseCodeWords uniqueMorseCodeWords;

    @BeforeEach
    public void setUp() {
        uniqueMorseCodeWords = new _804_UniqueMorseCodeWords();
    }

    @Test
    public void uniqueMorseRepresentations_case_1() throws Exception {
        String[] words = {"gin", "zen", "gig", "msg"};
        int output = 2;
        assertEquals(output, uniqueMorseCodeWords.uniqueMorseRepresentations(words));
    }

    @Test
    public void uniqueMorseRepresentations_case_2() throws Exception {
        String[] words = {"a"};
        int output = 1;
        assertEquals(output, uniqueMorseCodeWords.uniqueMorseRepresentations(words));
    }
}