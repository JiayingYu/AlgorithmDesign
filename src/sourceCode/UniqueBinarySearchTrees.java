package sourceCode;

public class UniqueBinarySearchTrees {
	public static int numTrees(int n) {
		if (n == 0 || n == 1) 
			return 1;
		int sum = 0;
		for (int k = 1; k <= n; k++) {
			sum += numTrees(k - 1) * numTrees(n - k);
		}
		return sum;
	}
	
	public static int BottomUpNumTrees(int n) {
		int[] rst = new int[n];
		rst[0] = 1;
		rst[1] = 1;
		for (int i = 2; i <=n; i++) {  //find solution from 2 to n
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				sum += rst[j-1] * rst[n-j];
			}
			rst[i] = sum;
		}
		return rst[n];
	}
}
