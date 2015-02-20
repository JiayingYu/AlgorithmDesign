package sourceCode;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
		int cur = m + n - 1;
		int pA = m - 1;
		int pB = n - 1;

		while (pA >= 0 && pB >= 0) {
			if (A[pA] > B[pB]) {
				A[cur] = A[pA];
				pA--;
			} else {
				A[cur] = B[pB];
				pB--;
			}
			cur--;
		}

		while (pB >= 0) {
			A[cur] = B[pB];
			pB--;
			cur--;
		}
	}
}
