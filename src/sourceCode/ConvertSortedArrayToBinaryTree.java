package sourceCode;
public class ConvertSortedArrayToBinaryTree {
	public static TreeNode sortedArrayToBST(int[] num) {
		return helper(num, 0, num.length - 1);
	}
	
	public static TreeNode helper(int[] num, int low, int high) {
		if (low > high) 
			return null;
		int mid = (low + high) / 2;
		int rootVal = num[mid];
		TreeNode root = new TreeNode(rootVal);
		TreeNode left = helper(num, low, mid - 1);
		TreeNode right = helper(num, mid + 1, high);
		root.left = left;
		root.right = right;
		return root;
	}
	
	public static void main(String[] args) {
		int[] num = {2, 4, 5, 7, 9, 11, 39 };
		sortedArrayToBST(num);
	}
}
