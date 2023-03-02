package leetcode;

import leetcode.utils.Array;

import java.util.Arrays;

/**
 * 905. 按奇偶排序数组
 */
public class SortArrayByParity035 {

	public static void main(String[] args) {
		int[] nums = Array.build("3,1,2,4");
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}

	public static int[] sortArrayByParity(int[] nums) {
		int n = nums.length;
		int l = 0, r = n - 1;
		while (l < r) {
			while (nums[r] % 2 == 1 && l < r) {
				r--;
			}
			while (nums[l] % 2 == 0 && l < r)
				l++;
			if (l < r) {
				int tmp = nums[l];
				nums[l] = nums[r];
				nums[r] = tmp;
				l++;
				r--;
			}
		}
		return nums;

	}
}
