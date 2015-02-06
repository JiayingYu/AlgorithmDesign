package sourceCode;
import java.util.ArrayList;
import java.util.List;

public class NQueens {
	public static List<String[]> solveNQueens(int n) {
		ArrayList<String[]> resList = new ArrayList<String[]>();
		if (n <= 0)
			return resList;
		search(n, new ArrayList<Integer>(), resList);
		return resList;
	}

	private static void search(int n, ArrayList<Integer> states,
			ArrayList<String[]> resList) {
		if (n == states.size()) { // all n queens have been placed
			resList.add(drawBoard(states));
			return;
		}

		for (int col = 0; col < n; col++) {
			if (!isValid(col, states)) {
				continue;
			} else {
				states.add(col);
				search(n, states, resList);
				states.remove(states.size() - 1);
			}
		}
	}

	private static boolean isValid(int col, ArrayList<Integer> states) {
		int row = states.size();
		for (int i = 0; i < row; i++) {
			if (states.get(i) == col)// check conflicts on columns
				return false;
			if (row - i == col - states.get(i))
				return false;
			if (row - i == states.get(i) - col)
				return false;
		}
		return true;
	}

	private static String[] drawBoard(ArrayList<Integer> states) {
		String[] board = new String[states.size()];
		for (int i = 0; i < states.size(); i++) {
			board[i] = "";
			for (int j = 0; j < states.size(); j++) {
				if (j == states.get(i)) {
					board[i] += "Q";
				} else {
					board[i] += ".";
				}
			}
		}
		return board;
	}
	
	public static void main(String[] args) {
		List<String[]> results = solveNQueens(6);
		for (String[] board : results) {
			for (String s : board) {
				System.out.println(s + " ");
			}
			System.out.println();
		}
	}
}
