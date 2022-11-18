package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _856_ScoreOfParenthesesTest {

    _856_ScoreOfParentheses scoreOfParentheses;

    @BeforeEach
    public void setUp() {
        scoreOfParentheses= new _856_ScoreOfParentheses();
    }

    @Test
    public void scoreOfParentheses_case_1() throws Exception {
        String s = "()";
        int expected = 1;
        assertEquals(expected, scoreOfParentheses.scoreOfParentheses(s));
    }

    @Test
    public void scoreOfParentheses_case_2() throws Exception {
        String s = "(())";
        int expected = 2;
        assertEquals(expected, scoreOfParentheses.scoreOfParentheses(s));
    }

    @Test
    public void scoreOfParentheses_case_3() throws Exception {
        String s = "()()";
        int expected = 2;
        assertEquals(expected, scoreOfParentheses.scoreOfParentheses(s));
    }

    @Test
    public void scoreOfParentheses_case_4() throws Exception {
        String s = "(()(()))"; //(1(1)) => (12) => 2*(1+2)
        int expected = 6;
        assertEquals(expected, scoreOfParentheses.scoreOfParentheses(s));
    }

    @Test
    public void scoreOfParentheses_case_5() throws Exception {
        String s = "(()(()()))";
        int expected = 10;
        assertEquals(expected, scoreOfParentheses.scoreOfParentheses(s));
    }
}

