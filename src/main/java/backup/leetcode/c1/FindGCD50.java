package backup.leetcode.c1;

import java.util.Arrays;

/**
 * 1979. 找出数组的最大公约数
 */
public class FindGCD50 {

	public static void main(String[] args) {

	}

	public static int findGCD(int[] nums) {
		Arrays.sort(nums);
		return gcd(nums[0], nums[nums.length - 1]);
	}

	public static int gcd(int x, int y) {
		return y == 0 ? x : gcd(y, x % y);
	}
}
