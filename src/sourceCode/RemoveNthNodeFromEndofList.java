package sourceCode;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode ptr1 = dummy;
		ListNode ptr2 = dummy;
		for (int i = 0; i < n; i++) {
			ptr2 = ptr2.next;
			if (ptr2 == null) {
				return head;
			}
		}

		while (ptr2.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		ptr1.next = ptr1.next.next;
		return dummy.next;
	}
}
