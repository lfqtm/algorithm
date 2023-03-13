package leetcode.c2;

import leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal74 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		System.out.println(inOrderTraversal(root));
	}

	public static List<Integer> inOrderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		inOrder(root, ans);
		return ans;
	}

	private static void inOrder(TreeNode root, List<Integer> ans) {
		if (root == null)
			return;
		inOrder(root.left, ans);
		ans.add(root.val);
		inOrder(root.right, ans);

	}
}
