package sourceCode;

public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    
    if (n == 0) {
        return matrix;
    }
    
    int top = 0;
    int bottom = n - 1;
    int left = 0;
    int right = n - 1;
    int num = 1;
    
    while (top <= bottom) {
        if (top == bottom) {
            matrix[top][top] = num++;
            break;
        }
        
        for (int i = left; i < right; i++) {  // fill in top row
            matrix[top][i] = num ++;
        }
        
        for (int i = top; i < bottom; i++) { // fill in right column
            matrix[i][right] = num++;
        }
        
        for (int i = right; i > left; i--) { //fill in bottom row
            matrix[bottom][i] = num++;
        }
        
        for (int i = bottom; i > top; i--) { //fill in left column
            matrix[i][left] = num++;
        }
        
        top++; left++; right--; bottom--;
    }
    
    return matrix;
	}
	
	public static void main(String[] args) {
		int[][] matrix = generateMatrix(2);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
