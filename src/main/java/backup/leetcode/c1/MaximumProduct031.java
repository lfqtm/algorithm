package backup.leetcode.c1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class MaximumProduct031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(maximumProduct(nums));

	}

	public static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		//最大乘积
		//全为正 最大的三个数相乘
		//全为负 也是最大的三个数相乘
		//有正有负 取一个正数和两个负数
		int n = nums.length;
		return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[n - 1] * nums[0] * nums[1]);
	}
}
