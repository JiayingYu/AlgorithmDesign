package sourceCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i <= rowIndex; i++) {
			for (int j = i; j >= 0; j--) {
				if (j == i) {
					result.add(1);
				} else if (j != 0) {
					result.set(j, result.get(j) + result.get(j - 1));
				}
			}
		}

		return result;
	}
}
