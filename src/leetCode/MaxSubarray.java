package leetCode;
public class MaxSubarray {
	public static int maxSubArray(int[] A) {
		return maxSub(A, 0, A.length - 1);
	}

	private static int maxSub(int[] a, int low, int high) {
		if (low == high)
			return a[low];

		int mid = (low + high) / 2;
		int maxL = maxSub(a, low, mid);
		int maxR = maxSub(a, mid + 1, high);
		int maxAcross = maxAcross(a, low, high, mid);
		return max(maxL, maxR, maxAcross);
	}

	private static int maxAcross(int[] a, int low, int high, int mid) {
		int sum1 = 0;
		int max1 = Integer.MIN_VALUE;
		for (int i = mid; i >= low; i--) {
			sum1 += a[i];
			if (sum1 > max1) {
				max1 = sum1;
			}
		}

		int sum2 = 0;
		int max2 = Integer.MIN_VALUE;
		for (int j = mid + 1; j <= high; j++) {
			sum2 += a[j];
			if (sum2 > max2) {
				max2 = sum2;
			}
		}

		return max1 + max2;
	}

	private static int max(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(a));
	}
}
