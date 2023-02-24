package leetcode;

import java.util.Arrays;

/**
 * 移除元素
 */
public class RemoveElement008 {

	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 2, 3};
		System.out.println(removeElement(nums, 3));
	}

	public static int removeElement(int[] nums, int val) {
		int l = 0;
		for (int r = 0; r < nums.length; r++) {
			if (nums[r] != val) {
				int tmp = nums[r];
				nums[r] = nums[l];
				nums[l] = tmp;
				l++;
			}
		}
//		return Arrays.copyOfRange(nums, 0, l).length;
		return l;
	}
}
