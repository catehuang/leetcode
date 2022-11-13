package easy;

import java.util.Map;

/**
 * Given a 2D integer array matrix, return the transpose of matrix.
 * The transpose of a matrix is the matrix flipped over its main diagonal,
 * switching the matrix's row and column indices.
 */
public class _867_TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns
        int[][] result = new int[n][m];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
