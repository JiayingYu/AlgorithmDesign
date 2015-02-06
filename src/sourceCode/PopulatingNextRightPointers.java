package sourceCode;
public class PopulatingNextRightPointers {
	public static void connect(TreeLinkNode root) {
		rec(root);
	}

	public static void rec(TreeLinkNode node) {
		if (node == null)
			return;
		if (node.left != null) {
			node.left.next = node.right;
		}
		if (node.right != null) {
			node.right.next = node.next == null ? null : node.next.left;
		}
		rec(node.left);
		rec(node.right);
	}
	
	public static void iterate(TreeLinkNode root) {
		if (root == null)
			return;
		
		TreeLinkNode leftP = root;
		TreeLinkNode cur;
		while (leftP != null && leftP.left != null) {
			cur = leftP;
			while(cur != null) {
				cur.left.next = cur.right;
				cur.right.next = cur.next == null ?  null : cur.next.left;
				cur = cur.next;
			}
			leftP = leftP.left;
		}
	}
}
