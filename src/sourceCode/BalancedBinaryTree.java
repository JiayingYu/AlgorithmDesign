package sourceCode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		return isBalancedAux(root).isBal;
	}

	public Res isBalancedAux(TreeNode node) {
		Res res = new Res();

		if (node == null) {
			res.isBal = true;
			res.height = 0;
			return res;
		}

		Res left = isBalancedAux(node.left);
		if (left.isBal == false) {
			res.isBal = false;
			return res;
		}

		Res right = isBalancedAux(node.right);
		if (right.isBal == false) {
			res.isBal = false;
			return res;
		}

		int height = max(left.height, right.height) + 1;
		boolean isBal = Math.abs(left.height - right.height) <= 1;

		res.isBal = isBal;
		res.height = height;
		return res;
	}

	public int max(int a, int b) {
		return a >= b ? a : b;
	}

	class Res {
		boolean isBal;
		int height;
	}
}
