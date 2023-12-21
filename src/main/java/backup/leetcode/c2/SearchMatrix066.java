package backup.leetcode.c2;

import backup.leetcode.utils.Array;

public class SearchMatrix066 {

	public static void main(String[] args) {
		System.out.println(searchMatrix(Array.build(), 3));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		//转换为一维数组，进行二分查找
		int m = matrix.length;
		int n = matrix[0].length;
		int count = m * n;
		int[] nums = new int[count];
		for (int i = 0; i < count; i++) {
			nums[i] = matrix[i / n][i % n];
		}

		return binarySearch(nums, target) != -1;
	}

	public static int binarySearch(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] > target)
				r = mid - 1;
			else if (nums[mid] < target)
				l = mid + 1;
			else
				return mid;
		}
		return -1;
	}

}
