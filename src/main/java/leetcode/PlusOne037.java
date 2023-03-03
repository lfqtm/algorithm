package leetcode;

import leetcode.utils.Array;

import java.util.Arrays;

/**
 * 66. 加一
 */
public class PlusOne037 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(Array.build("9,9,9"))));
	}

	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			digits[i]++;
			digits[i] %= 10;
			if (digits[i] != 0) return digits; //等于0则继续往前进一
		}
		digits = new int[n + 1];
		digits[0] = 1; //若是999,直接新建数组，长度+1
		return digits;
	}
}
