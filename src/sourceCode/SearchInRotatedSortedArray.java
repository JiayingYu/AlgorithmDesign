package sourceCode;

public class SearchInRotatedSortedArray {
	public int search(int[] A, int target) {
		if (A == null || A.length == 0) {
			return -1;
		}

		return search(A, target, 0, A.length - 1);
	}

	public int search(int[] A, int target, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (A[mid] == target)
			return mid;

		// has to use <= in case low == mid
		if (A[low] <= A[mid]) { // left side sorted
			if (target > A[mid] || target < A[low]) {
				return search(A, target, mid + 1, high);
			} else {
				return search(A, target, low, mid - 1);
			}
		} else { // right side sorted
			if (target < A[mid] || target > A[high]) {
				return search(A, target, low, mid - 1);
			} else {
				return search(A, target, mid + 1, high);
			}
		}
	}
}
