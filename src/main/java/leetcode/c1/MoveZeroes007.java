package leetcode.c1;

import java.util.Arrays;

/**
 * 移动零
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZeroes007 {

	public static void main(String[] args) {
		int[] nums = new int[]{0, 1, 0, 3, 12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void moveZeroes(int[] nums) {
		int l = 0;
		int tmp = 0;
		for (int r = 0; r < nums.length; r++) {
			if (nums[r] != 0) {
				tmp = nums[r];
				nums[r] = nums[l];
				nums[l] = tmp;
				l++;
			}
		}

	}

}
