package leetCode;

public class SortColors {
	public void sortColors(int[] A) {
		int left = 0; // all elements are 0 before A[left]
		int right = A.length - 1; // all elements are 2 after A[right]
		// elements in between are 1
		int cur = 0;
		while (cur <= right) {
			if (A[cur] == 0) {
				swap(A, cur, left);
				left++;
				cur++;
			} else if (A[cur] == 2) {
				swap(A, cur, right);
				right--;
			} else {
				cur++;
			}
		}
	}

	public void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public static int[] sortColors2(int[] A) {
		int[] c = new int[3];
		int[] b = new int[A.length];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = 0;
		}
		
		for (int i = 0; i < A.length; i++) {
			c[A[i]] ++;
		}
		
		for (int i = 1; i < c.length; i++) {
			c[i] += c[i-1];
		}
		
		for (int i = 0; i < A.length; i++) {
			b[c[A[i]] - 1] = A[i];
			c[A[i]] --;
		}

		return b;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 0};
		int[] b = sortColors2(a);
		for (int x : b) {
			System.out.println(x);
		}
	}
}
