package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _542_01MatrixTest {

    _542_01Matrix matrix;

    @BeforeEach
    public void setUp() {
        matrix = new _542_01Matrix();
    }

    @Test
    public void updateMatrix_case_1() throws Exception {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertTrue(Arrays.deepEquals(expected, matrix.updateMatrix(mat)));
    }

    @Test
    public void updateMatrix_case_2() throws Exception {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] expected = {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
        assertTrue(Arrays.deepEquals(expected, matrix.updateMatrix(mat)));
    }
}