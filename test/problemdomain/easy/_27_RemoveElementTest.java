package easy;

import medium.easy._27_RemoveElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _27_RemoveElementTest {

    private _27_RemoveElement removeElement;

    @BeforeEach
    void setUp() {
        this.removeElement = new _27_RemoveElement();
    }

    @AfterEach
    void tearDown() {
        this.removeElement = null;
    }

    @Test
    void testcase1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        assertEquals(2, this.removeElement.removeElement(nums, val));
    }

    @Test
    void testcase2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4 ,2};
        int val = 2;
        assertEquals(5, this.removeElement.removeElement(nums, val));
    }
}