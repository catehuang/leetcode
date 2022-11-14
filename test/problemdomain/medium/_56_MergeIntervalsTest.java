package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _56_MergeIntervalsTest {

    _56_MergeIntervals mergeIntervals;

    @BeforeEach
    public void setUp() {
        mergeIntervals = new _56_MergeIntervals();
    }

    @Test
    public void merge_case_1() throws Exception {
        int[][] intervals = new int[][] {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] expected = new int[][] {
                {1, 6},
                {8, 10},
                {15, 18}
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_2() throws Exception {
        int[][] intervals = new int[][] {
                {1, 4},
                {4, 5},
        };
        int[][] expected = new int[][] {
                {1, 5}
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_3() throws Exception {
        int[][] intervals = new int[][] {
                {1, 5},
                {2, 4},
                {3, 6},
                {15, 18}
        };
        int[][] expected = new int[][] {
                {1, 6},
                {15, 18}
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_4() throws Exception {
        int[][] intervals = new int[][] {
                {1, 4},
                {0, 5},
        };
        int[][] expected = new int[][] {
                {0, 5},
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_5() throws Exception {
        int[][] intervals = new int[][] {
                {2, 3},
                {4, 5},
                {6, 7},
                {1, 10},
        };
        int[][] expected = new int[][] {
                {1, 10},
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_6() throws Exception {
        int[][] intervals = new int[][] {
                {1, 4},
                {5, 6},
        };
        int[][] expected = new int[][] {
                {1, 4},
                {5, 6}
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_7() throws Exception {
        int[][] intervals = new int[][] {
                {1, 4},
                {0, 1},
        };
        int[][] expected = new int[][] {
                {0, 4},
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_8() throws Exception {
        int[][] intervals = new int[][] {
                {1, 4},
                {2, 3},
        };
        int[][] expected = new int[][] {
                {1, 4},
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_9() throws Exception {
        int[][] intervals = new int[][] {
                {1, 4},
                {0, 0},
        };
        int[][] expected = new int[][] {
                {0, 0},
                {1, 4}
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }

    @Test
    public void merge_case_10() throws Exception {
        int[][] intervals = new int[][] {
                {2, 3},
                {5, 5},
                {2, 2},
                {3, 4},
                {3, 4}
        };
        int[][] expected = new int[][] {
                {2, 4},
                {5, 5}
        };
        assertTrue(Arrays.deepEquals(expected, mergeIntervals.merge(intervals)));
    }
}