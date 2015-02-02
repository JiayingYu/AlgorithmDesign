package leetCode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		preorderAux(list, root);
		return list;
	}

	private static void preorderAux(List<Integer> list, TreeNode node) {
		if (node == null)
			return;
		list.add(node.val);
		preorderAux(list, node.left);
		preorderAux(list, node.right);
	}

	public static List<Integer> preorderIt(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		if (root == null)
			return list;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			list.add(node.val);
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null) 
				stack.push(node.left);
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rightN = new TreeNode(2);
		root.right = rightN;
		System.out.println(preorderIt(root).toString());

		System.out.println(preorderIt(null).toString());
	}
}
