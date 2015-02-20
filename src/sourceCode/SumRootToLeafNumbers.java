package sourceCode;

public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
		return dfs(root, 0);
	}

	public int dfs(TreeNode root, int pre) {
		if (root == null) {
			return 0;
		}

		int cur = pre * 10 + root.val;

		if (root.left == null && root.right == null) {
			return cur;
		}

		return dfs(root.left, cur) + dfs(root.right, cur);
	}
}
