package leetcode.c1;

import leetcode.utils.Array;

import java.util.Arrays;

/**
 * 922. 按奇偶排序数组 II
 */
public class SortArrayByParityII036 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrayByParityII(Array.build("4,2,5,7"))));
	}

	public static int[] sortArrayByParityII(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];

		int i = 0;
		for (int x : nums) {
			if (x % 2 == 0) {
				ans[i] = x;
				i += 2;
			}
		}

		i = 1;
		for (int y : nums) {
			if (y % 2 == 1) {
				ans[i] = y;
				i += 2;
			}
		}

		return ans;
	}
}
