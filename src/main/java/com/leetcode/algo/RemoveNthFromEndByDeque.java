package com.leetcode.algo;

import com.leetcode.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveNthFromEndByDeque {

	public static void main(String[] args) {
		ListNode head = ListNode.create(new int[]{1, 2, 3, 4, 5});

		ListNode.forEachVal(removeNthFromEnd(head, 3));
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		Deque<ListNode> stack = new LinkedList<>();
		ListNode p = head;
		while (p != null) {
			stack.push(p);
			p = p.next;
		}

		for (int i = 0; i < n; i++) {
			stack.pop();
		}

		ListNode cur = stack.peek();
		cur.next = cur.next.next;
		return head;
	}
}
