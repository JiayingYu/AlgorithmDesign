package sourceCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascal = new ArrayList<List<Integer>>();

		if (numRows == 0) {
			return pascal;
		}

		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					list.add(1);
				else {
					int num = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
					list.add(num);
				}
			}
			pascal.add(list);
		}

		return pascal;
	}
}
