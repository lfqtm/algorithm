package com.leetcode.algo;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] idx = new int[2];

		int n = numbers.length;
		int low = 0, high = n - 1;
		int m = 0;
		while (low < high) {
			m = numbers[low] + numbers[high];
			if (m > target) {
				high--;
			} else if (m < target) {
				low++;
			} else {
				idx[0] = low + 1;
				idx[1] = high + 1;
				break;
			}
		}
		return idx;
	}
}
