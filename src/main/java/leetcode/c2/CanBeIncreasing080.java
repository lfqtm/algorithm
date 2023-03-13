package leetcode.c2;

import java.util.Scanner;

public class CanBeIncreasing080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(canBeIncreasing(nums));

	}

	public static boolean canBeIncreasing(int[] nums) {
		int n = nums.length;
		int index = -1;
		int flag = 0;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] >= nums[i + 1]) {
				index = i;
				flag++;
			}
			if (flag > 1) {
				//超过两个非严格递增的数
				return false;
			}
		}

		//index代表要清除的元素
		if (index == 0 || index == n - 2)
			return true;
		if (nums[index - 1] >= nums[index + 1])
			return false;
		return true;

	}
}
