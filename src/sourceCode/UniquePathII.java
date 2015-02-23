package sourceCode;

public class UniquePathII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int r = obstacleGrid.length;
		int c = obstacleGrid[0].length;
		int[][] d = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (obstacleGrid[i][j] == 1) {
					d[i][j] = 0;
				} else if (i == 0 && j == 0) {
					d[i][j] = 1;
				} else if (i == 0) {
					d[i][j] = d[i][j - 1];
				} else if (j == 0) {
					d[i][j] = d[i - 1][j];
				} else {
					d[i][j] = d[i - 1][j] + d[i][j - 1];
				}
			}
		}

		return d[r - 1][c - 1];
	}
}
