package sourceCode;
public class SwapNodesInPairs {
	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;
		ListNode cur = head;
		ListNode prev = dummyHead;

		while (cur != null && cur.next != null) {
			ListNode nextStart = cur.next.next;
			prev.next = cur.next;
			prev.next.next = cur;
			cur.next = nextStart;
			prev = cur;
			cur = nextStart;
		}

		return dummyHead.next;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode cur = swapPairs(n1);
		while(cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
}
