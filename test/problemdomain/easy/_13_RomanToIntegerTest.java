package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        this.romanToInteger = new RomanToInteger();
    }

    @AfterEach
    void tearDown() {
        this.romanToInteger = null;
    }

    @Test
    void testI() {
        String s = "III";
        assertEquals(3, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testVI() {
        String s = "VI";
        assertEquals(6, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testIV() {
        String s = "VI";
        assertEquals(6, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testXL() {
        String s = "XL";
        assertEquals(40, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testLX() {
        String s = "LX";
        assertEquals(60, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testXC() {
        String s = "XC";
        assertEquals(90, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testCX() {
        String s = "CX";
        assertEquals(110, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testCD() {
        String s = "CD";
        assertEquals(400, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testDC() {
        String s = "DC";
        assertEquals(600, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testCM() {
        String s = "CM";
        assertEquals(900, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testMC() {
        String s = "MC";
        assertEquals(1100, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testIVXLCDM() {
        String s = "IVXLCDM";
        assertEquals(1444, this.romanToInteger.romanToInt(s));
    }

    @Test
    void testMDCLXVI() {
        String s = "MDCLXVI";
        assertEquals(1666, this.romanToInteger.romanToInt(s));
    }
}