package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _867_TransposeMatrixTest {

    _867_TransposeMatrix transposeMatrix;

    @BeforeEach
    public void setUp() {
        transposeMatrix = new _867_TransposeMatrix();
    }

    @Test
    public void transpose_case_1() throws Exception {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = new int[][] {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        assertTrue(Arrays.deepEquals(expected, transposeMatrix.transpose(matrix)));
    }

    @Test
    public void transpose_case_2() throws Exception {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] expected = new int[][] {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        assertTrue(Arrays.deepEquals(expected, transposeMatrix.transpose(matrix)));
    }

    @Test
    public void transpose_case_3() throws Exception {
        int[][] matrix = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int[][] expected = new int[][] {
                {1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}
        };
        assertTrue(Arrays.deepEquals(expected, transposeMatrix.transpose(matrix)));
    }

    @Test
    public void transpose_case_4() throws Exception {
        int[][] matrix = new int[][] {
                {1}
        };
        int[][] expected = new int[][] {
                {1}
        };
        assertTrue(Arrays.deepEquals(expected, transposeMatrix.transpose(matrix)));
    }

    @Test
    public void transpose_case_5() throws Exception {
        int[][] matrix = new int[][] {
                {1, 4},
                {2, 5},
                {3, 6}

        };
        int[][] expected = new int[][] {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertTrue(Arrays.deepEquals(expected, transposeMatrix.transpose(matrix)));
    }

    @Test
    public void transpose_case_6() throws Exception {
        int[][] matrix = new int[][] {
                {1, 5},
                {2, 6},
                {3, 7},
                {4, 8}
        };
        int[][] expected = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        assertTrue(Arrays.deepEquals(expected, transposeMatrix.transpose(matrix)));
    }
}