package leetCode;

public class PopulatingNextRightPointersII {
	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}

		TreeLinkNode leftEnd = root;

		while (leftEnd != null) {
			TreeLinkNode cur = leftEnd;
			TreeLinkNode dummy = new TreeLinkNode(-1);
			TreeLinkNode pre = dummy;

			while (cur != null) {

				if (cur.left != null) {
					pre.next = cur.left;
					pre = pre.next;
				}
				if (cur.right != null) {
					pre.next = cur.right;
					pre = pre.next;
				}
				cur = cur.next;
			}
			leftEnd = dummy.next;
		}
	}
}
