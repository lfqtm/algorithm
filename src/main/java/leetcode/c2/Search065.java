package leetcode.c2;

import leetcode.utils.Array;

import java.util.Arrays;

/**
 * 33. 搜索旋转排序数组
 */
public class Search065 {

	public static void main(String[] args) {
		System.out.println(search(Array.build("4,5,6,7,0,1,2"), 0));
	}

	public static int search(int[] nums, int target) {
		int l = 0, r = 1;
		int mid = 0;
		while (r < nums.length) {
			if (nums[l] > nums[r])
				mid = r;
			r++;
			l++;
		}

		int[] nums1 = Arrays.copyOfRange(nums, 0, mid);
		int[] nums2 = Arrays.copyOfRange(nums, mid, nums.length);
		int i = binarySearch(nums1, target);
		if (i != -1)
			return i;
		else {
			int j = binarySearch(nums2, target);
			if (j != -1)
				return nums1.length + j;
		}
		return -1;

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
