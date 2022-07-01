package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfTheLastWordTest {

    private LengthOfTheLastWord lengthOfTheLastWord;

    @BeforeEach
    void setUp() {
        this.lengthOfTheLastWord = new LengthOfTheLastWord();
    }

    @AfterEach
    void tearDown() {
        this.lengthOfTheLastWord = null;
    }

    @Test
    void testcase1() {
        String s = "Hello World";
        int expected = 5;
        assertEquals(expected, this.lengthOfTheLastWord.getIndex(s));
    }

    @Test
    void testcase2() {
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        assertEquals(expected, this.lengthOfTheLastWord.getIndex(s));
    }

    @Test
    void testcase3() {
        String s = "luffy is still joyboy";
        int expected = 6;
        assertEquals(expected, this.lengthOfTheLastWord.getIndex(s));
    }

    @Test
    void testcase4() {
        String s = "a";
        int expected = 1;
        assertEquals(expected, this.lengthOfTheLastWord.getIndex(s));
    }

}