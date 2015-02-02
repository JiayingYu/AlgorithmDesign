package test;

public class Ch9Q7 {
	static int i;
	static int j;
	
	public static void test(int x, int y) {
		x = y;
	}
	
	public static void main(String[] args) {
		i = 2;
		j = 3;
		test(i, j);
	}
}

/*If pass-by-value-result is used, when test method is called, the value of 
 * actual parameter i, j is passed to formal parameter x, y, then x, y act as local 
 * variables and x is assigned with the value of y which is 3, then this value is
 * stored back to actual parameter i, so i will be 3 after test is called.
 * 
 * If pass-by-reference is used. i will be an alias of j after test is called. 
 * The reference of actual parameter i and j are passed to x and y, so x will take
 * the reference of y, which makes actual parameter i and j referencing to the
 * same memory location.
 */
