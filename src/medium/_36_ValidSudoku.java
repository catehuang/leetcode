package medium;

import java.util.HashSet;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class _36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !column.add(board[j][i])) {
                    return false;
                }
            }
        }

        for (int i = 0; i < m / 3; i++) {
            for (int j = 0; j < n / 3; j++) {
                if (!validateBox(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validateBox(int x, int y, char[][] board) {
        HashSet<Character> box = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[3 * x + i][3 * y + j] != '.' && !box.add(board[3 * x + i][3 * y + j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
