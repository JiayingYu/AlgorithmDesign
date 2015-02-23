package sourceCode;

public class MinDepthBinaryTree {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;

		return minDepthRec(root);
	}

	public int minDepthRec(TreeNode root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		return Math.min(minDepthRec(root.left), minDepthRec(root.right)) + 1;
	}
}
