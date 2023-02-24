package leetcode;

import java.util.Arrays;

/**
 * 1480. 一维数组的动态和
 */
public class RunningSum001 {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(nums)));
	}

	/**
	 * 思路： 遍历数组，下标为i是取前i个元素和
	 */
	public static int[] runningSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			nums[i] = sum;
		}
		return nums;
	}
}
