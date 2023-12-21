package backup.leetcode.c2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1909. 删除一个元素使数组严格递增
 */
public class LeftRigthDifference079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(leftRigthDifference(nums)));

	}

	public static int[] leftRigthDifference(int[] nums) {
		int n = nums.length;
		int[] leftSum = new int[n];
		int[] rightSum = new int[n];
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0)
				leftSum[i] = 0;
			if (i == n - 1)
				rightSum[i] = 0;
			//0到
			for (int j = 0; j < i; j++) {
				leftSum[i] += nums[j];
			}

			for (int j = n - 1; j > i; j--) {
				rightSum[i] += nums[j];
			}
		}

		for (int i = 0; i < n; i++) {
			ans[i] = Math.abs(leftSum[i] - rightSum[i]);
		}
		return ans;
	}
}
