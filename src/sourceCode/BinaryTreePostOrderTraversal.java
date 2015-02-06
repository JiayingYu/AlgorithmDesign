package sourceCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		postOrderAux(root, list);
		return list;
	}

	public void postOrderAux(TreeNode node, ArrayList<Integer> list) {
		if (node == null) {
			return;
		}

		postOrderAux(node.left, list);
		postOrderAux(node.right, list);
		list.add(node.val);
	}
}
