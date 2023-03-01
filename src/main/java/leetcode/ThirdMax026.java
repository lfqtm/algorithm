package leetcode;

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
}
