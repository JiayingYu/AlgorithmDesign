package sourceCode;

public class FindMinInRotatedSortedArrayII {
	public int findMin(int[] num) {
		if (num[0] < num[num.length - 1]) { // the array is not rotated
			return num[0];
		}

		return findMin(num, 0, num.length - 1);
	}

	public int findMin(int[] num, int low, int high) {
		if (low >= high) {
			return num[low];
		}

		if (num[low] < num[high]) {
			return num[low];
		}

		int mid = (low + high) / 2;

		if (num[low] > num[mid]) { // pivot in the left side
			return findMin(num, low, mid);
		} else if (num[low] < num[mid]) {
			return findMin(num, mid, high);
		} else {
			return findMin(num, low + 1, high);
		}
	}
}
