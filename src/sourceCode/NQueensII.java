package sourceCode;
import java.util.ArrayList;

public class NQueensII {
	public static int totalNQueens(int n) {
    if (n <= 0) 
        return 0;
    ArrayList<Integer> states = new ArrayList<Integer>();
    return search(n, states);
}

	private static int search(int n, ArrayList<Integer> states) {
		if (n == states.size())
			return 1;

		int sum = 0;
		for (int col = 0; col < n; col++) {
			if (!isValid(col, states))
				continue;
			else {
				states.add(col);
				sum += search(n, states);
				states.remove(states.size() - 1);
			}
		}
		return sum;
	}

	private static boolean isValid(int col, ArrayList<Integer> states) {
		int row = states.size();
		for (int i = 0; i < row; i++) {
			if (states.get(i) == col)
				return false;
			if (row - i == Math.abs(col - states.get(i)))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(totalNQueens(10));
	}
}
