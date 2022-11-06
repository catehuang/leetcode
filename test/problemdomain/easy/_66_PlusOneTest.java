package easy;

import medium.easy._66_PlusOne;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _66_PlusOneTest {

    private _66_PlusOne plusOne;

    @BeforeEach
    void setUp() {
        this.plusOne = new _66_PlusOne();
    }

    @AfterEach
    void tearDown() {
        this.plusOne = null;
    }

    @Test
    void testcase1() {
        int[] digits = {1, 2, 3};
        String output = Arrays.toString(this.plusOne.plusOne(digits));
        String expected = Arrays.toString(new int[]{1, 2, 4});
        assertEquals(expected, output);
    }

    @Test
    void testcase2() {
        int[] digits = {9, 9, 9};
        String output = Arrays.toString(this.plusOne.plusOne(digits));
        String expected = Arrays.toString(new int[]{1, 0, 0, 0});
        assertEquals(expected, output);
    }

    @Test
    void testcase3() {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        String output = Arrays.toString(this.plusOne.plusOne(digits));
        String expected = Arrays.toString(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1});
        assertEquals(expected, output);
    }

    @Test
    void testcase4() {
        int[] digits = {8, 9, 9, 9};
        String output = Arrays.toString(this.plusOne.plusOne(digits));
        String expected = Arrays.toString(new int[]{9, 0, 0, 0});
        assertEquals(expected, output);
    }
}