package com.leetcode.algo;

public class SearchInsert {

	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		System.out.println(searchInsert(nums, 4));

	}

	public static int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		int m = 0;
		while (low <= high) {
			m = (high - low) / 2 + low;
			if (nums[m] > target) {
				high = m - 1;
			} else if (nums[m] < target) {
				low = m + 1;
			} else {
				return m;
			}
		}
		return high + 1; //right - 1
	}

}
