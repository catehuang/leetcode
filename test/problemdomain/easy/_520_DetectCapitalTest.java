package easy;

import medium.easy._520_DetectCapital;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _520_DetectCapitalTest {

    private _520_DetectCapital detectCapital;

    @BeforeEach
    public void setUp() {
        detectCapital = new _520_DetectCapital();
    }

    @Test
    public void detectCapitalUse_case_1() throws Exception {
        assertTrue(detectCapital.detectCapitalUse("USA"));
    }

    @Test
    public void detectCapitalUse_case_2() throws Exception {
        assertTrue(detectCapital.detectCapitalUse("usa"));
    }

    @Test
    public void detectCapitalUse_case_3() throws Exception {
        assertFalse(detectCapital.detectCapitalUse("USa"));
    }

    @Test
    public void detectCapitalUse_case_4() throws Exception {
        assertFalse(detectCapital.detectCapitalUse("FlaG"));
    }

    @Test
    public void detectCapitalUse_case_5() throws Exception {
        assertTrue(detectCapital.detectCapitalUse("GG"));
    }
}