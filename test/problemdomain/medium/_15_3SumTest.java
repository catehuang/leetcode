package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _15_3SumTest {

    private _15_3Sum threeSum = new _15_3Sum();

    @Test
    public void threeSum_case_1() throws Exception {
        int[] input = new int[] {-1, 0, 1, 2, -1, -4}; //-4, -1, -1, 0, 1, 2
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = threeSum.threeSum(input);
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(-1);
        list1.add(2);
        Collections.sort(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(-1);
        list2.add(0);
        list2.add(1);
        expected.add(list1);
        expected.add(list2);
        Collections.sort(list2);
        assertEquals(expected.size(), output.size());
        int correct = 0;
        for (List<Integer> l: expected) {
            if (output.contains(l)) {
                correct++;
            }
        }
        assertEquals(expected.size(), correct);
    }

    @Test
    public void threeSum_case_2() throws Exception {
        int[] input = new int[] {0, 1, 1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = threeSum.threeSum(input);
        assertEquals(expected.size(), output.size());
        int correct = 0;
        for (List<Integer> l: expected) {
            if (output.contains(l)) {
                correct++;
            }
        }
        assertEquals(expected.size(), correct);
    }

    @Test
    public void threeSum_case_3() throws Exception {
        int[] input = new int[] {0, 0, 0};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = threeSum.threeSum(input);
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(0);
        list1.add(0);
        expected.add(list1);
        assertEquals(expected.size(), output.size());
        int correct = 0;
        for (List<Integer> l: expected) {
            if (output.contains(l)) {
                correct++;
            }
        }
        assertEquals(expected.size(), correct);
    }

    @Test
    public void threeSum_case_4() throws Exception {
        int[] input = new int[] {1, 2, -2, -1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = threeSum.threeSum(input);
        List<Integer> list1 = new ArrayList<>();

        assertEquals(expected.size(), output.size());
        int correct = 0;
        for (List<Integer> l: expected) {
            if (output.contains(l)) {
                correct++;
            }
        }
        assertEquals(expected.size(), correct);
    }

    @Test
    public void threeSum_case_5() throws Exception {
        int[] input = new int[] {0, 0, 0, 0};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = threeSum.threeSum(input);
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(0);
        list1.add(0);
        expected.add(list1);
        Collections.sort(list1);
        assertEquals(expected.size(), output.size());
        int correct = 0;
        for (List<Integer> l: expected) {
            if (output.contains(l)) {
                correct++;
            }
        }
        assertEquals(expected.size(), correct);
    }
}