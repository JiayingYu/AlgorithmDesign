package sourceCode;

public class MininumPathSum {
	public int minPathSum(int[][] grid) {
		int[][] shrst = new int[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				shrst[i][j] = 0;
			}
		}
		return minPath(grid, shrst, 0, 0);
	}

	public int minPath(int[][] grid, int[][] shrst, int i, int j) {
		int rows = grid.length;
		int cols = grid[0].length;
		if (shrst[i][j] != 0) {
			return shrst[i][j];
		} else if (i == rows - 1 && j == cols - 1) {
			return shrst[i][j] = grid[rows - 1][cols - 1];
		} else if (i == rows - 1) {
			return shrst[i][j] = minPath(grid, shrst, i, j + 1) + grid[i][j];
		} else if (j == cols - 1) {
			return shrst[i][j] = minPath(grid, shrst, i + 1, j) + grid[i][j];
		} else {
			int rmin = minPath(grid, shrst, i, j + 1);
			int dmin = minPath(grid, shrst, i + 1, j);
			shrst[i][j] = Math.min(rmin, dmin) + grid[i][j];
			return shrst[i][j];
		}
	}
}
