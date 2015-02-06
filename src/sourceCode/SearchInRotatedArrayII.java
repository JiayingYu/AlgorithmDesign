package sourceCode;

public class SearchInRotatedArrayII {
	public boolean search(int[] A, int target) {
		return searchAux(A, target, 0, A.length - 1);
	}

	public boolean searchAux(int[] A, int target, int low, int high) {
		if (low > high) {
			return false;
		}

		int mid = (low + high) / 2;

		if (A[mid] == target) {
			return true;
		}

		if (A[low] < A[mid]) { // left side is normally ordered
			if (target >= A[low] && target < A[mid]) {
				return searchAux(A, target, low, mid - 1);
			} else {
				return searchAux(A, target, mid + 1, high);
			}
		} else if (A[low] > A[mid]) { // right side is normally ordered
			if (target > A[mid] && target <= A[high]) {
				return searchAux(A, target, mid + 1, high);
			} else {
				return searchAux(A, target, low, mid - 1);
			}
		} else {
			return searchAux(A, target, low + 1, high);
		}

	}
}
