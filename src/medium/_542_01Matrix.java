package medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 * The distance between two adjacent cells is 1.
 */
public class _542_01Matrix {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();

        // store the positions of 0s into queues by their x and y; otherwise fill dummy values
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (mat[i][j] == 0)
                {
                    qx.add(i);
                    qy.add(j);
                }
                else
                {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // go through all 0s and fill neighbors with values
        while (!qx.isEmpty())
        {
            // deal with each position of 0s
            int x = qx.poll();
            int y = qy.poll();
            // explore four directions
            for (int i = 0; i < directions.length; i++)
            {
                int nx = x + directions[i][0];
                int ny = y + directions[i][1];
                // deal with neighbors
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && mat[nx][ny] > mat[x][y] + 1)
                {
                    // modify the value => +1, and save neighbors into queue
                    mat[nx][ny] = mat[x][y] + 1;
                    qx.add(nx);
                    qy.add(ny);
                }
            }
        }
        return mat;
    }
}
