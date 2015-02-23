package sourceCode;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;

		return hasPathSum(root, sum, 0);
	}

	public boolean hasPathSum(TreeNode root, int sum, int preSum) {
		if (root == null) {
			return false;
		}

		int curSum = preSum + root.val;

		if (root.left == null && root.right == null) {
			return curSum == sum;
		}

		return hasPathSum(root.left, sum, curSum)
				|| hasPathSum(root.right, sum, curSum);
	}
}
