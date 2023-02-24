package com.leetcode.algo;

import com.leetcode.ListNode;

/**
 * #876 链表的中间结点
 */
public class MiddleNode {
	public static void main(String[] args) {
		//[1,2,3,4,5]
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;


	}

	/**
	 * 快慢指针
	 */
	public static ListNode middleNode(ListNode head) {

		return new ListNode();
	}

}

