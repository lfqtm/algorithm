package leetcode.c2;

import leetcode.utils.Array;

import java.util.Arrays;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class SearchRange064 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(Array.build("5,7,7,8,8,10"), 8)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int left = binarySearch(nums, target, true);
		int right = binarySearch(nums, target, false) - 1;
		if (left <= right && left < nums.length && nums[left] == target && nums[right] == target)
			return new int[]{left, right};
		return new int[]{-1, -1};

	}

	public static int binarySearch(int[] nums, int target, boolean flag) {
		int l = 0, r = nums.length - 1, ans = nums.length;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			// flag为true查找第一个大于等于target的值的下标
			// flag为false查找第一个大于target的值的下标
			if (nums[mid] > target || (flag && nums[mid] >= target)) {
				r = mid - 1;
				ans = mid;
			} else {
				l = mid + 1;
			}
		}
		return ans;
	}
}
