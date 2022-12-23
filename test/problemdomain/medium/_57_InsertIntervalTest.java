package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _57_InsertIntervalTest {

    _57_InsertInterval insertInterval;

    @BeforeEach
    public void setUp() {
        insertInterval = new _57_InsertInterval();
    }

    @Test
    public void insert_case_1() throws Exception {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        assertTrue(Arrays.deepEquals(insertInterval.insert(intervals, newInterval), expected));
    }

    @Test
    public void insert_case_2() throws Exception {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        assertTrue(Arrays.deepEquals(insertInterval.insert(intervals, newInterval), expected));
    }

    @Test
    public void insert_case_3() throws Exception {
        int[][] intervals = {};
        int[] newInterval = {5, 7};
        int[][] expected = {{5, 7}};
        assertTrue(Arrays.deepEquals(insertInterval.insert(intervals, newInterval), expected));
    }

    @Test
    public void insert_case_4() throws Exception {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {6, 8};
        int[][] expected = {{1, 5}, {6, 8}};
        assertTrue(Arrays.deepEquals(insertInterval.insert(intervals, newInterval), expected));
    }

    @Test
    public void insert_case_5() throws Exception {
        int[][] intervals = {{3, 6}};
        int[] newInterval = {1, 2};
        int[][] expected = {{1, 2}, {3, 6}};
        assertTrue(Arrays.deepEquals(insertInterval.insert(intervals, newInterval), expected));
    }

    @Test
    public void insert_case_6() throws Exception {
        int[][] intervals = {{3, 5}, {12, 15}};
        int[] newInterval = {6, 6};
        int[][] expected = {{3, 5}, {6, 6},  {12, 15}};
        assertTrue(Arrays.deepEquals(insertInterval.insert(intervals, newInterval), expected));
    }
}