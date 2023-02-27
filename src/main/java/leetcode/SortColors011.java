package leetcode;

import java.util.Arrays;

import static com.algo.class01.Sorts.swap;

public class SortColors011 {

	public static void main(String[] args) {
		int[] nums = new int[]{2, 0, 2, 1, 1, 0};
		sortColors(nums);

	}

	public static void sortColors(int[] nums) {
		int current = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				swap(nums, current++, i);
			}
		}

		for (int i = 0; i < n; i++) {
			if (nums[i] == 1) {
				swap(nums, current++, i);
			}
		}

		System.out.println(Arrays.toString(nums));
	}
}
