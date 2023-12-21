package backup.leetcode.c2;

import backup.leetcode.utils.TreeNode;

public class SortedArrayToBST061 {

	public static void main(String[] args) {

	}

	public static TreeNode sortedArrayToBST(int[] nums) {
		return build(nums, 0, nums.length - 1);
	}

	public static TreeNode build(int[] nums, int left, int right) {
		if (left > right)
			return null;

		int mid = (left + right) / 2; //取中间位置元素为根节点
		TreeNode root = new TreeNode(nums[mid]);
		root.left = build(nums, left, mid - 1);
		root.right = build(nums, mid + 1, right);
		return root;
	}
}
