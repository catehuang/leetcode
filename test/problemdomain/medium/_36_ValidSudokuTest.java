package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _36_ValidSudokuTest {

    _36_ValidSudoku validSudoku;

    @BeforeEach
    public void setUp() {
        validSudoku = new _36_ValidSudoku();
    }

    @Test
    public void isValidSudoku_case_1() throws Exception {
        char[][] board =
                        {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        boolean expected = true;
        assertEquals(expected, validSudoku.isValidSudoku(board));
    }
    @Test
    public void isValidSudoku_case_2() throws Exception {
        char[][] board =
                {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        boolean expected = false;
        assertEquals(expected, validSudoku.isValidSudoku(board));
    }
}