package leetCode;
public class MaxDepthBST {
	public static int maxDepth(TreeNode root) {
		if (root == null) return 0;
		int maxDepth = max(maxDepth(root.left), maxDepth(root.right)) + 1;
		return maxDepth;
	}
	
	private static int max(int a, int b) {
		if (a >= b) return a;
		else return b;
	}
}

