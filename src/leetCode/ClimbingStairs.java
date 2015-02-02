package leetCode;
public class ClimbingStairs {
	public static int climb(int n) {
		if (n <= 1) {
			return n;
		}

		int last = 1;
		int lastlast = 1;
		int cur = 0;
		for (int i = 2; i <= n; i++) {
			cur = last + lastlast;
			lastlast = last;
			last = cur;
		}
		return cur;
	}
}
