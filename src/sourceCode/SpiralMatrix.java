package sourceCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return list;
		}

		int left = 0;
		int top = 0;
		int right = matrix[0].length - 1;
		int bottom = matrix.length - 1;

		while (left <= right && top <= bottom) {
			// add top row
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}

			// add right column
			for (int i = top + 1; i <= bottom - 1; i++) {
				list.add(matrix[i][right]);
			}

			// add bottom row
			if (top != bottom) {
				for (int i = right; i >= left; i--) {
					list.add(matrix[bottom][i]);
				}
			}

			// add left column
			if (left != right) {
				for (int i = bottom - 1; i >= top + 1; i--) {
					list.add(matrix[i][left]);
				}
			}

			left++;
			top++;
			right--;
			bottom--;
		}

		return list;
	}
}
