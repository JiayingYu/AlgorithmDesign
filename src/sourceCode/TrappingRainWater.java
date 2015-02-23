package sourceCode;

public class TrappingRainWater {
	public int trap(int[] A) {
		if (A == null) {
			return 0;
		}

		int vol = 0;
		int len = A.length;
		int[] leftMax = new int[len];
		int[] rightMax = new int[len];

		for (int i = 0; i < len; i++) {
			if (i == 0) {
				leftMax[i] = A[i];
			} else {
				leftMax[i] = Math.max(leftMax[i - 1], A[i]);
			}
		}

		for (int i = len - 1; i >= 0; i--) {
			if (i == len - 1) {
				rightMax[i] = A[i];
			} else {
				rightMax[i] = Math.max(rightMax[i + 1], A[i]);
			}
		}

		for (int i = 0; i < len; i++) {
			int height = Math.min(leftMax[i], rightMax[i]);
			if (height > A[i]) {
				vol += height - A[i];
			}
		}

		return vol;
	}
}
