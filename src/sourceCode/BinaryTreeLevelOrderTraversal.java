package sourceCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		if (root == null) {
			return res;
		}

		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> level = new ArrayList<Integer>();
			res.add(level);

			for (int i = 0; i < levelSize; i++) {
				TreeNode cur = queue.poll();
				level.add(cur.val);

				if (cur.left != null) {
					queue.add(cur.left);
				}

				if (cur.right != null) {
					queue.add(cur.right);
				}
			}
		}

		return res;
	}
}
