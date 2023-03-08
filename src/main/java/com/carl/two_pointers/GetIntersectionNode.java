package com.carl.two_pointers;

import leetcode.utils.ListNode;

/**
 * 面试题 02.07. 链表相交
 */
public class GetIntersectionNode {
	public static void main(String[] args) {
		ListNode headA = ListNode.create(new int[]{4, 1, 8, 4, 5});
		ListNode headB = ListNode.create(new int[]{5, 0, 1, 8, 4, 5});

		System.out.println(getIntersectionNode(headA, headB));

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode pa = headA;
		ListNode pb = headB;

		while (pa.val != pb.val) {
			//pa指针先遍历完heada之后再遍历headb
			pa = pa != null ? pa.next : headB;
			//pb相反
			pb = pb != null ? pb.next : headA;
			//1 在相交的情况下，pa和pb走过的长度是一样的
			//2 不相交，pa和pb走完两个链表并等于null
		}
		return pa;
	}
}
