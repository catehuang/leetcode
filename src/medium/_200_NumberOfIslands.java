package medium;

/**
 * Given an m x n 2D binary grid, which represents a map of '1's (land) and '0's (water),
 * return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or
 * vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class _200_NumberOfIslands {
    private int m, n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        if (m == 0 || n == 0) {
            return 0;
        }

        int numberOfIslands = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    numberOfIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numberOfIslands;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        if (grid[i][j] == '1') {
            // this spot has been checked
            grid[i][j] = '0';
            // check four directions
            dfs(grid, i - 1, j);
            dfs(grid, i + 1, j);
            dfs(grid, i, j - 1);
            dfs(grid, i, j + 1);
        }
    }
}
