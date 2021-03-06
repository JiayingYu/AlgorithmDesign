package sourceCode;
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode head;
		if (l1.val <= l2.val) {
			head = new ListNode(l1.val);
			l1 = l1.next;
		} else {
			head = new ListNode(l2.val);
			l2 = l2.next;
		}

		ListNode cur = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}

		while (l1 != null) {
			cur.next = l1;
			l1 = l1.next;
			cur = cur.next;
		}

		while (l2 != null) {
			cur.next = l2;
			l2 = l2.next;
			cur = cur.next;
		}
		return head;
	}
}
