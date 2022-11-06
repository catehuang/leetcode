package easy;

import medium.easy._26_RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _26_RemoveDuplicatesFromSortedArrayTest {

    private _26_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void setUp() {
        this.removeDuplicatesFromSortedArray = new _26_RemoveDuplicatesFromSortedArray();
    }

    @AfterEach
    void tearDown() {
        this.removeDuplicatesFromSortedArray = null;
    }

    @Test
    void testcase1() {
        int[] nums = {1, 1, 2};
        assertEquals(2, this.removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    void testcase2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, this.removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}