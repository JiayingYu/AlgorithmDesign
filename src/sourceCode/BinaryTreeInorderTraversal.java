package sourceCode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		inorderAux(list, root);
		return list;
	}

	private static void inorderAux(List<Integer> list, TreeNode node) {
		if (node == null)
			return;
		inorderAux(list, node.left);
		list.add(node.val);
		inorderAux(list, node.right);
	}
	
	public static List<Integer> inorderIT(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		if (root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		
		do {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				cur = stack.pop();
				list.add(cur.val);
				cur = cur.right;
			}
		} while (!stack.isEmpty() || cur != null);

		return list;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rightN = new TreeNode(2);
		root.right = rightN;
		System.out.print(inorderIT(root).toString());
	}
}
