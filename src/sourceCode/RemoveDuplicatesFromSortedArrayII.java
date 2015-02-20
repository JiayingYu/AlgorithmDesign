package sourceCode;

public class RemoveDuplicatesFromSortedArrayII {
	public static int removeDuplicates(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}

		int count = 1;
		int index = 0;

		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[index]) {
				if (count >= 2) {
					count++;
				} else {
					A[++index] = A[i];
					count++;
				}
			} else {
				A[++index] = A[i];
				count = 1;
			}
		}

		return index + 1;
	}
	
}
