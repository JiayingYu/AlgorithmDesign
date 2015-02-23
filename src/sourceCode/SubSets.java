package sourceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
	public List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		if (S == null || S.length == 0) {
			return res;
		}

		Arrays.sort(S);

		dfs(S, res, new ArrayList<Integer>(), 0);
		return res;
	}

	public void dfs(int[] S, List<List<Integer>> res, ArrayList<Integer> path,
			int index) {

		for (int i = index; i < S.length; i++) {
			path.add(S[i]);
			dfs(S, res, path, i + 1); // add the subset from index i to the end
			path.remove(path.size() - 1);
		}

		res.add(new ArrayList<Integer>(path));
	}
}
