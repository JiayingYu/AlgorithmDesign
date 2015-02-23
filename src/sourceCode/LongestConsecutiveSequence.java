package sourceCode;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}

		int max = 1;
		HashSet<Integer> hash = new HashSet<Integer>();

		for (int x : num) {
			hash.add(x);
		}

		for (int x : num) {
			int left = x - 1;
			int right = x + 1;
			int count = 1;

			while (hash.contains(left)) {
				hash.remove(left);
				left--;
				count++;
			}

			while (hash.contains(right)) {
				hash.remove(right);
				right++;
				count++;
			}

			max = Math.max(count, max);
		}
		return max;
	}
}
