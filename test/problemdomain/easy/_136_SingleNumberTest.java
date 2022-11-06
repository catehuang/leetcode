package easy;

import medium.easy._136_SingleNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _136_SingleNumberTest {

    _136_SingleNumber singleNumber;

    @BeforeEach
    void setUp() {
        this.singleNumber = new _136_SingleNumber();
    }

    @AfterEach
    void tearDown() {
        this.singleNumber = null;
    }

    @Test
    void singleNumberTestCase1() {
        int[] nums = {2, 2, 1};
        int expected = 1;
        assertEquals(expected, this.singleNumber.singleNumber(nums));
    }

    @Test
    void singleNumberTestCase2() {
        int[] nums = {4, 1, 2, 1, 2};
        int expected = 4;
        assertEquals(expected, this.singleNumber.singleNumber(nums));
    }

    @Test
    void singleNumberTestCase3() {
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, this.singleNumber.singleNumber(nums));
    }
}