package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 268. 丢失的数字
 */
public class MissingNumber022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i)
				return i;
		}
		return nums.length;

	}
}
