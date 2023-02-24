package com.carl.two_pointers;

import com.leetcode.ListNode;

public class RemoveNthFromEnd {

	public static void main(String[] args) {
		ListNode.forEachVal(removeNthFromEnd(ListNode.create(new int[] {1,2,3,4,5}), 2));
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int len = getLen(head);
		ListNode dummyNode = new ListNode(-1, head);

		ListNode cur = head;
		for (int i = 1; i < len - n; i++) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		return dummyNode.next;
	}

	public static int getLen(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}
}
