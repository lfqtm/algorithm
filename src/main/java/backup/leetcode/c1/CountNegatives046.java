package backup.leetcode.c1;

import backup.leetcode.utils.Array;

import java.util.Arrays;

/**
 * 1351. 统计有序矩阵中的负数
 */
public class CountNegatives046 {

	public static void main(String[] args) {
		int[][] mat = Array.build();
		System.out.println(countNegatives(mat));
	}

	public static int countNegatives(int[][] grid) {
		//转换成一维数组
		int m = grid.length;
		int n = grid[0].length;
		int count = m * n;
		int[] nums = new int[count];
		for (int i = 0; i < count; i++) {
			nums[i] = grid[i / n][i % n];
		}

		Arrays.sort(nums);
		//二分查找第一个不为负数的值
		int l = 0, r = count - 1;
		int mid = 0, index = 0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (nums[mid] > 0) {
				index = mid;
				r--;
			} else {
				l++;
			}
		}
		return index;
	}
}
