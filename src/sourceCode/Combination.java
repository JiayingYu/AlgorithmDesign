package sourceCode;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (n == 0 || k == 0) {
			return result;
		}

		List<Integer> path = new ArrayList<Integer>();
		combine(n, k, result, path, 1);

		return result;
	}

	public void combine(int n, int k, List<List<Integer>> result,
			List<Integer> path, int index) {
		if (k == 0) {
			result.add(new ArrayList<Integer>(path));
			return;
		}

		for (int i = index; i <= n - k + 1; i++) {
			path.add(i);
			combine(n, k - 1, result, path, i + 1);
			path.remove(path.size() - 1);
		}
	}
}
