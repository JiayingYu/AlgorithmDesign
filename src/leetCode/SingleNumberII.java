package leetCode;

public class SingleNumberII {
	public static int singleNumber(int[] A) {
		int one = 0;
		int two = 0;
		int three = 0;
		
		for (int i = 0; i < A.length; i++) {
			two = (A[i] & one) | two;
			one = one ^ A[i];
			three = one & two;
			one -= three;
			two -= three;
		}
		
		return one;
	}
	
	public static void main(String[] args) {
		int[] a = {3, 3, 3, 5, 6, 9, 9, 5, 6, 6, 5, 4, 9};
		System.out.println(singleNumber(a));
	}
}
