package sourceCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		LinkedList<List<Integer>> bottomUpList = new LinkedList<List<Integer>>();
		if (root == null) {
			return bottomUpList;
		}

		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			ArrayList<Integer> levelList = new ArrayList<Integer>();
			int levelSize = queue.size();

			for (int i = 0; i < levelSize; i++) {
				TreeNode elem = queue.poll();
				levelList.add(elem.val);

				if (elem.left != null) {
					queue.add(elem.left);
				}

				if (elem.right != null) {
					queue.add(elem.right);
				}
			}
			bottomUpList.offerFirst(levelList);
		}

		return bottomUpList;
	}

}
