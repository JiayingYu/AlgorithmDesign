package sourceCode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		if (n == 0) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			res.add(0);
			return res;
		}

		List<Integer> tmp = grayCode(n - 1);
		int addNumber = 1 << (n - 1);
		ArrayList<Integer> res = new ArrayList<Integer>(tmp);

		for (int i = tmp.size() - 1; i >= 0; i--) {
			res.add(tmp.get(i) + addNumber);
		}

		return res;
	}
}
