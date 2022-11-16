package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _682_BaseballGameTest {

    _682_BaseballGame baseballGame;

    @BeforeEach
    public void setUp() {
        baseballGame = new _682_BaseballGame();
    }

    @Test
    public void calPoints_case_1() throws Exception {
        String[] ops = new String[] {
                "5", "2", "C", "D", "+"
        };
        int output = 30;
        assertEquals(output, baseballGame.calPoints(ops));
    }

    @Test
    public void calPoints_case_2() throws Exception {
        String[] ops = new String[] {
                "5", "-2", "4", "C", "D", "9", "+", "+"
        };
        int output = 27;
        assertEquals(output, baseballGame.calPoints(ops));
    }

    @Test
    public void calPoints_case_3() throws Exception {
        String[] ops = new String[] {
                "1", "C"
        };
        int output = 0;
        assertEquals(output, baseballGame.calPoints(ops));
    }

    @Test
    public void calPoints_case_4() throws Exception {
        String[] ops = new String[] {
                "1", "C", "-62", "-45", "-68"
        };
        int output = -175;
        assertEquals(output, baseballGame.calPoints(ops));
    }

    @Test
    public void calPoints_case_5() throws Exception {
        String[] ops = new String[] {
                "1", "6", "C", "C", "-68"
        };
        int output = -68;
        assertEquals(output, baseballGame.calPoints(ops));
    }
}