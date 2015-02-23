package sourceCode;

public class FactorialTrailingZeros {
	/* count(n!)=n/5+count((n/5)!) */
	public int trailingZeroes(int n) {
		int count = 0;
		while (n >= 5) {
			n /= 5;
			count += n;
		}
		return count;
	}
}
