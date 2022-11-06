package easy;

import medium.easy._344_ReverseString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _344_ReverseStringTest {

    private _344_ReverseString reverseString;

    @BeforeEach
    public void setUp() {
        reverseString = new _344_ReverseString();
    }

    @Test
    public void reverseString_case_1() throws Exception {
        char[] c = new char[] {'h','e','l','l','o'};
        char[] output = new char[] {'o','l','l','e','h'};
        char[] result = reverseString.reverseString(c);
        for (int i = 0; i < c.length ; i++) {
            assertEquals(output[i], result[i]);
        }
    }

    @Test
    public void reverseString_case_2() throws Exception {
        char[] c = new char[] {'H','a','n','n','a','h'};
        char[] output = new char[] {'h','a','n','n','a','H'};
        char[] result = reverseString.reverseString(c);
        for (int i = 0; i < c.length ; i++) {
            assertEquals(output[i], result[i]);
        }
    }
}