package test;

public class RemoveElements {
	public int removeElement(int[] A, int elem) {
		int size = A.length;
		for (int i = 0; i < size; i++) {
			if (A[i] == elem) {
				int temp = A[i];
				A[i] = A[size - 1];
				A[size - 1] = temp;
				size--;
				i--;
			}
		}
		return size;
	}
}
