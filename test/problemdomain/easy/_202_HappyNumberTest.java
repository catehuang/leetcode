package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _202_HappyNumberTest {

    _202_HappyNumber happyNumber;

    @BeforeEach
    public void setUp() {
        happyNumber = new _202_HappyNumber();
    }

    @Test
    public void isHappy_case_1() throws Exception {
        int n = 19;
        boolean expected = true;
        assertEquals(expected, happyNumber.isHappy(n));
    }

    @Test
    public void isHappy_case_2() throws Exception {
        int n = 2;
        boolean expected = false;
        assertEquals(expected, happyNumber.isHappy(n));
    }

    @Test
    public void isHappy_case_3() throws Exception {
        int n = 4;
        boolean expected = false;
        assertEquals(expected, happyNumber.isHappy(n));
    }
}