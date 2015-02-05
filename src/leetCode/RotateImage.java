package leetCode;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int len = matrix.length;
		for (int layer = 0; layer < len / 2; layer++) {
			int first = layer;
			int last = len - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top
				matrix[first][i] = matrix[last - offset][first]; // left to top
				matrix[last - offset][first] = matrix[last][last - offset]; // bottom to
																																		// left
				matrix[last][last - offset] = matrix[i][last]; // right to bottom
				matrix[i][last] = top;
			}

		}
	}
}
