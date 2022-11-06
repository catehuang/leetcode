package easy;

import medium.easy._20_ValidParentheses;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _20_ValidParenthesesTest {

    private _20_ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        this.validParentheses = new _20_ValidParentheses();
    }

    @AfterEach
    void tearDown() {
        this.validParentheses = null;
    }

    @Test
    void testcase1() {
        String s = "()";
        assertTrue(this.validParentheses.isValid(s));
    }

    @Test
    void testcase2() {
        String s = "(]";
        assertFalse(this.validParentheses.isValid(s));
    }

    @Test
    void testcase3() {
        String s = "{})";
        assertFalse(this.validParentheses.isValid(s));
    }

    @Test
    void testcase4() {
        String s = "((()";
        assertFalse(this.validParentheses.isValid(s));
    }

    @Test
    void testcase5() {
        String s = "[](){}";
        assertTrue(this.validParentheses.isValid(s));
    }

    @Test
    void testcase6() {
        String s = "{([])}";
        assertTrue(this.validParentheses.isValid(s));
    }

    @Test
    void testcase7() {
        String s = "[]({)}";
        assertFalse(this.validParentheses.isValid(s));
    }

}