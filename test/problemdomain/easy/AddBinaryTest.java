package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    private AddBinary addBinary;

    @BeforeEach
    void setUp() {
        this.addBinary = new AddBinary();
    }

    @AfterEach
    void tearDown() {
        this.addBinary = null;
    }

    @Test
    void testcase1() {
        String a = "11";
        String b = "1";
        String expected = "100";
        assertEquals(expected, this.addBinary.addBinary(a, b));
    }

    @Test
    void testcase2() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        assertEquals(expected, this.addBinary.addBinary(a, b));
    }

    @Test
    void testcase3() {
        String a = "1";
        String b = "1011";
        String expected = "1100";
        assertEquals(expected, this.addBinary.addBinary(a, b));
    }

    @Test
    void testcase5() {
        String a = "1";
        String b = "11011100011";
        String expected = "11011100100";
        assertEquals(expected, this.addBinary.addBinary(a, b));
    }

    @Test
    void testcase6() {
        String a = "0";
        String b = "0";
        String expected = "0";
        assertEquals(expected, this.addBinary.addBinary(a, b));
    }

}