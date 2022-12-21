package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _169_MojorityElementTest {

    _169_MojorityElement mojorityElement;

    @BeforeEach
    public void setUp() {
        mojorityElement = new _169_MojorityElement();
    }

    @Test
    public void majorityElement_case_1() throws Exception {
        int[] nums = {3, 2, 3};
        int output = 3;
        assertEquals(output, mojorityElement.majorityElement(nums));
    }

    @Test
    public void majorityElement_case_2() throws Exception {
        int[] nums = {2,2,1,1,1,2,2};
        int output = 2;
        assertEquals(output, mojorityElement.majorityElement(nums));
    }

    @Test
    public void majorityElement_case_3() throws Exception {
        int[] nums = {1};
        int output = 1;
        assertEquals(output, mojorityElement.majorityElement(nums));
    }
}