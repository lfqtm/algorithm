package leetcode.c1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 169. 多数元素
 */
public class ContainsDuplicate020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i+1])
				return true;
		}
		return false;
	}
}
