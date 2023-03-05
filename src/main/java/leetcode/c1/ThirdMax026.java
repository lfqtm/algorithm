package leetcode.c1;

import leetcode.utils.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdMax026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println(thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int flag = 3;
		for (int i = n - 1; i > -1; i--) {
			if (i == n - 1 || nums[i] != nums[i + 1]) {
				flag--;
			}
			if (flag == 0) {
				return nums[i];
			}
		}
		return nums[n - 1];
	}

	/**
	 * 747. 至少是其他数字两倍的最大数
	 */
	public static class DominantIndex033 {


		public static void main(String[] args) {
			System.out.println(dominantIndex(Array.build("3,6,1,0")));
		}

		public static int dominantIndex(int[] nums) {
			//一次遍历找最大值和最小值
			int m1 = -1, m2 = -1;
			int index = -1;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > m1) {
					m2 = m1;
					m1 = nums[i];
					index = i;
				} else if (nums[i] > m2) {
					m2 = nums[i];
				}
			}
			return m1 >= m2 * 2 ? index : -1;

		}
	}
}
