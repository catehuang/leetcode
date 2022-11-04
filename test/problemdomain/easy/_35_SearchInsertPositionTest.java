package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _35_SearchInsertPositionTest {

    private _35_SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void setUp() {
        this.searchInsertPosition = new _35_SearchInsertPosition();
    }

    @AfterEach
    void tearDown() {
        this.searchInsertPosition = null;
    }

    @Test
    void testcase1() {
        int[] nums ={1, 3, 5, 6};
        int target = 5;
        assertEquals(2, this.searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void testcase2() {
        int[] nums ={1, 3, 5, 6};
        int target = 2;
        assertEquals(1, this.searchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void testcase3() {
        int[] nums ={1, 3, 5, 6};
        int target = 7;
        assertEquals(4, this.searchInsertPosition.searchInsert(nums, target));
    }
}