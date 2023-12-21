package backup.leetcode.c2;

import backup.leetcode.utils.Array;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 */
public class ThreeSumClosest068 {

	public static void main(String[] args) {
		System.out.println(threeSumClosest(Array.build("4,0,5,-5,3,3,0,-4,-5"), -2));
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length;
		int best = Integer.MAX_VALUE;
		for (int i = 0; i < n - 3 + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + 3; j++) {
				sum += nums[j];
			}
			if (Math.abs(sum - target) < Math.abs(best - target)) {
				best = sum;
			}
		}
		return best;
	}
}
