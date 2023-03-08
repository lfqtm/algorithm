package leetcode.c1;

import leetcode.utils.ListNode;

/**
 * 876. 链表的中间结点
 *      给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 *      如果有两个中间结点，则返回第二个中间结点。
 */
public class MiddleNode005 {

	public static void main(String[] args) {

	}

	/**
	 * 快慢指针
	 *  fast 步长为2
	 *  slow 步长为1
	 *  当fast遍历完后，fast的下标位置就是
	 */
	public static ListNode middleNode(ListNode head) {

		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;

	}
}
