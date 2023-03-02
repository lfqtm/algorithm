package leetcode.utils;

public final class Array {

	public static int[] build(String str) {
		String[] split = str.split(",");
		int n = split.length;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(split[i]);
		}
		return nums;
	}
}
