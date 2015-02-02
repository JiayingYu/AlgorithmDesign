package test;
import java.util.Random;


public class Demo {
	static int[][] stMatrix1 = new int[100][100];
	static int[][] stMatrix2 = new int[100][100];
	static int[][] stMatrix3 = new int[100][100];
	static int times = 200;

	public static void main(String[] args) {
		testDyn();
		testStatic();
	}

	public static void testDyn() {
		int[][] localMatrix1 = new int[100][100];
		int[][] localMatrix2 = new int[100][100];
		int[][] localMatrix3 = new int[100][100];

		Random rd = new Random();

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				localMatrix1[i][j] = rd.nextInt(100) + 1;
				localMatrix2[i][j] = rd.nextInt(100) + 1;
			}
		}
		
		long startDynamic = System.currentTimeMillis();

		for (int i = 0; i < times; i++)
			multiple(localMatrix1, localMatrix2, localMatrix3);

		long endDynamic = System.currentTimeMillis();
		long elapsesDynamic = endDynamic - startDynamic;
		System.out.println("Time elapsed for stack dynamic matrices: "
				+ elapsesDynamic);
	}

	public static void testStatic() {
		Random rd = new Random();

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				stMatrix1[i][j] = rd.nextInt(100) + 1;
				stMatrix2[i][j] = rd.nextInt(100) + 1;
			}
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				stMatrix1[i][j] = rd.nextInt(100) + 1;
				stMatrix2[i][j] = rd.nextInt(100) + 1;
			}
		}

		long start = System.currentTimeMillis();

		for (int i = 0; i < times; i++)
			multiple(stMatrix1, stMatrix2, stMatrix3);

		long end = System.currentTimeMillis();
		long elapsed = end - start;
		System.out.println("Time elapsed for static matrices: "
				+ elapsed);
	}

	private static void multiple(int[][] a, int[][] b, int[][] result) {
		int rowA = a.length - 1;
		int colA = a[0].length - 1;
		int rowB = b.length - 1;
		int colB = b[0].length - 1;

		for (int i = 0; i <= rowA; i++) {
			for (int j = 0; j <= colB; j++) {
				for (int k = 0; k <= colA; k++) {
					result[i][j] = a[i][k] * b[k][j];
				}
			}
		}
	}
}