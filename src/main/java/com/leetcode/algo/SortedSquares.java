package com.leetcode.algo;

import java.util.Arrays;

public class SortedSquares {

	public static void main(String[] args) {
		int[] nums = {-4, -1, 0, 3, 10};
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}

	/**
	 * 有序数组平方
	 * @param nums
	 * @return
	 */
	public static int[] sortedSquares(int[] nums) {
		// 1 新数组
		int n = nums.length;
		int[] newNums = new int[n];
		// 2 定义两个指针分布从左右端开始遍历数组
		for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
			if (nums[i] * nums[i] > nums[j] * nums[j]) {
				newNums[pos] = nums[i] * nums[i];
				i++;
			} else {
				newNums[pos] = nums[j] * nums[j];
				j--;
			}
			pos--;
		}
		return newNums;
	}
}
