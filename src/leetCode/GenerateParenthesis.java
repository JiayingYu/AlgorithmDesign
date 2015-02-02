package leetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		ArrayList<String> res = new ArrayList<String>();

		if (n == 0) {
			return res;
		}

		String s = "";
		getPair(0, 0, n, res, s);
		return res;
	}

	public void getPair(int left, int right, int n, ArrayList<String> res,
			String s) {
		if (left < right)
			return;

		if (left == n && right == n) {
			res.add(s);
			return;
		}

		if (left < n) {
			getPair(left + 1, right, n, res, s + "(");
		}

		if (right < n) {
			getPair(left, right + 1, n, res, s + ")");
		}
	}
}
