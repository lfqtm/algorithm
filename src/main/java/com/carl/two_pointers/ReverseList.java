package com.carl.two_pointers;

import com.leetcode.ListNode;

import java.util.Stack;

public class ReverseList {

	public static void main(String[] args) {
		ListNode.forEachVal(
			reverseList(ListNode.create(new int[] {1,2,3,4,5})));
	}

	public static ListNode reverseList(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		ListNode dummy = new ListNode(-1);
		head = dummy; //做新listnode的工作指针
		while (!stack.empty()) {
			head.next = stack.pop();
			head = head.next;
		}
		head.next = null;
		return dummy.next;
	}

//	public static ListNode reverseList(ListNode head) {
//		ListNode pre = null;
//		ListNode cur = head;
//		ListNode tmp;
//		while (cur != null) {
//			tmp = cur.next;
//			cur.next = pre;
//			pre = cur;
//			cur = tmp;
//		}
//		return pre;
//	}

}
