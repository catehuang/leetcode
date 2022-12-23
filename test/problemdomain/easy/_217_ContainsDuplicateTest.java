package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _217_ContainsDuplicateTest {

    _217_ContainsDuplicate containsDuplicate;

    @BeforeEach
    public void setUp() {
        containsDuplicate = new _217_ContainsDuplicate();
    }

    @Test
    public void containsDuplicate_case1() throws Exception {
        int[] nums = {1, 2, 3, 1};
        boolean expected = true;
        assertEquals(expected, containsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void containsDuplicate_case2() throws Exception {
        int[] nums = {1, 2, 3, 4};
        boolean expected = false;
        assertEquals(expected, containsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void containsDuplicate_case3() throws Exception {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean expected = true;
        assertEquals(expected, containsDuplicate.containsDuplicate(nums));
    }
}