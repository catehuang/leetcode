package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _771_JewelsAndStonesTest {

    _771_JewelsAndStones jewelsAndStones;

    @BeforeEach
    public void setUp() {
        jewelsAndStones = new _771_JewelsAndStones();
    }

    @Test
    public void numJewelsInStones_case_1() throws Exception {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        assertEquals(expected, jewelsAndStones.numJewelsInStones(jewels, stones));
    }

    @Test
    public void numJewelsInStones_case_2() throws Exception {
        String jewels = "z";
        String stones = "ZZ";
        int expected = 0;
        assertEquals(expected, jewelsAndStones.numJewelsInStones(jewels, stones));
    }
}