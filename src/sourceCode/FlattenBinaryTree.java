package sourceCode;

public class FlattenBinaryTree {
	public void flatten(TreeNode root) {
		flattenAux(root);
	}

	public TreeNode flattenAux(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode tail = root;
		TreeNode left = root.left;
		TreeNode right = root.right;

		root.left = null;
		root.right = null;

		if (left != null) {
			tail.right = left;
			tail = flattenAux(left);
		}

		if (right != null) {
			tail.right = right;
			tail = flattenAux(right);
		}

		return tail;
	}
}
