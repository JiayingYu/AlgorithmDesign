package sourceCode;
public class FindMinInRotatedSortedArray {
	public static int findMin(int[] num) {
		if (num[0] < num[num.length - 1])
      return num[0];
		
		return findMinAux(num, 0, num.length - 1);
	}

	public static int findMinAux(int[] num, int low, int high) {
		if ((high - low) == 1) {
			return num[high];
		}
		int mid = (low + high) / 2;
		if (num[mid] > num[low]) {
			return findMinAux(num, mid, high);
		} else {
			return findMinAux(num, low, mid);
		}
	}
	
	public static void main(String[] args) {
		int[] num = {4,5,6,7,0,1,2};
		System.out.println(findMin(num));
		int[] num2 = {1, 2, 3};
		System.out.println(findMin(num2));
	}
}
