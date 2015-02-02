package leetCode;

public class SingleNumber {
	public static int singleNumber(int[] A) {
    int result = 0;
    for (int i = 0; i < A.length; i++) {
    	result = result ^ A[i];
    }
    return result;
  }
	
	public static void main(String[] args) {
		int[] test = {3, 4, 5, 6, 9, 9, 4, 3, 6};
		System.out.println(singleNumber(test));
	}
}
