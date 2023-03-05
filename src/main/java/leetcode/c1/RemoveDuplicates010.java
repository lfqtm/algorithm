package leetcode.c1;

import java.util.Arrays;

/**
 * 80. 删除有序数组中的重复项 II
 */
public class RemoveDuplicates010 {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 1, 1, 2, 2, 3};
		System.out.println(removeDuplicates(nums));

	}

	/**
	 * 双指针 元素最多出现两次
	 */
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		if (n <= 2) {
			return n;
		}
		//双指针
		int slow = 2, fast = 2;
		while (fast < n) {
			if (nums[fast] != nums[slow - 2]) {
				nums[slow] = nums[fast];
				++slow;
			}
			++fast;
		}

		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, slow)));
		return slow;


	}
}
