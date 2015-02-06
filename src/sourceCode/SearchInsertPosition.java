package sourceCode;
public class SearchInsertPosition {
	public static int searchInsert(int[] A, int target) {
		return rec(A, target, 0, A.length - 1);
	}

	public static int rec(int[] A, int target, int low, int high) {
		if (low > high)
			return low;
		int mid = (low + high) / 2;
		if (target > A[mid]) {
			return rec(A, target, mid + 1, high);
		} else if (target < A[mid]) {
			return rec(A, target, low, mid - 1);
		} else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1};
		System.out.println(searchInsert(a, 1));
	}
}
