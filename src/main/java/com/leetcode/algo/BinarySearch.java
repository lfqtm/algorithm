package com.leetcode.algo;

public class BinarySearch {
	public static void main(String[] args) {
//		int[] nums = {-1,0,3,5,9,12};
		int[] nums = {2, 3, 4, 5, 7};
		System.out.println(binarySearch(nums, 2));
		System.out.println(binarySearch(nums, 7));
	}

	public static int binarySearch(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		int mid;
		while (low <= high) {
			mid = (high - low) / 2 + low;
			if (nums[mid] > target)
				high = mid - 1;
			else if (nums[mid] < target)
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}
