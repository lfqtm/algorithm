package leetcode.c2;

import leetcode.utils.Array;

public class FindMaxAverage063 {
	public static void main(String[] args) {
		System.out.println(findMaxAverage(Array.build("-1"), 1));
	}

	public static double findMaxAverage(int[] nums, int k) {
		int n = nums.length;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < n - k + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += nums[j];
			}
			ans = Math.max(ans, sum);
		}
		return (double) ans / k;
	}
}
