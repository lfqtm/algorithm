package com.leetcode;

import junit.framework.TestCase;

public class ListNodeTest extends TestCase {

	public void testCreate() {
		ListNode listNode = ListNode.create(new int[]{1, 2, 3, 4, 5});
		System.out.println("listNode = " + listNode);
	}
}
