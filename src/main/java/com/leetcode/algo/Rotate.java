package com.leetcode.algo;

import java.util.Arrays;

// #189
public class Rotate {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		rotate(nums, 3);
		System.out.println("nums = " + Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {
		// 法一 辅助数组
//		int n = nums.length;
//		int[] arr = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[(i+k)%n] = nums[i];
//		}
//		System.arraycopy(arr, 0, nums, 0, n);

		//法二 多次转置数组 双指针
		//先对k取数组长度n的膜
		int n = nums.length;
		k %= n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	public static void reverse(int[] nums, int l, int h) {
		int temp = 0;
		while (l < h) {
			temp = nums[l];
			nums[l] = nums[h];
			nums[h] = temp;
			l++;
			h--;
		}
	}
}
