package backup.leetcode.c1;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 */
public class Merge113 {

	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[]{2, 5, 6};

		merge(nums1, 3, nums2, 3);

		System.out.println(Arrays.toString(nums1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] sorted = new int[m + n];
		int p1 = 0, p2 = 0;
		int cur;
		while (p1 < m || p2 < n) {
			if (p1 == m) {
				cur = nums2[p2++];
			} else if (p2 == n) {
				cur = nums1[p1++];
			} else if (nums1[p1] > nums2[p2]) {
				cur = nums2[p2++];
			} else {
				cur = nums1[p1++];
			}
			sorted[p1 + p2 - 1] = cur;
		}

		for (int i = 0; i != m + n; i++) {
			nums1[i] = sorted[i];
		}
	}
}
