package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _200_NumberOfIslandsTest {

    _200_NumberOfIslands numberOfIslands;

    @BeforeEach
    public void setUp() {
        numberOfIslands = new _200_NumberOfIslands();
    }

    @Test
    public void numIslands_case_1() throws Exception {
        char[][] grid = {
                new char[]{'1', '1', '1', '1', '0'},
                new char[]{'1', '1', '0', '1', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '0', '0', '0'}
        };
        int expected = 1;
        assertEquals(expected, numberOfIslands.numIslands(grid));
    }

    @Test
    public void numIslands_case_2() throws Exception {
        char[][] grid = {
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '1', '0', '0'},
                new char[]{'0', '0', '0', '1', '1'}
        };
        int expected = 3;
        assertEquals(expected, numberOfIslands.numIslands(grid));
    }

    @Test
    public void numIslands_case_3() throws Exception {
        char[][] grid = {
                new char[]{'1', '0', '1', '0', '1'},
                new char[]{'0', '1', '0', '1', '0'},
                new char[]{'0', '0', '1', '0', '1'},
                new char[]{'0', '1', '0', '1', '0'}
        };
        int expected = 9;
        assertEquals(expected, numberOfIslands.numIslands(grid));
    }
}