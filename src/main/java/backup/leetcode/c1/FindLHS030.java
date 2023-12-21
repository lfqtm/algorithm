package backup.leetcode.c1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 594. 最长和谐子序列
 */
public class FindLHS030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(findLHS(nums));

	}

	public static int findLHS(int[] nums) {
		Arrays.sort(nums);

		int l = 0, ans = 0;
		for (int r = 0; r < nums.length; r++) {
			while (nums[r] - nums[l] > 1) {
				l++;
			}
			if (nums[r] - nums[l] == 1) {
				ans = Math.max(ans, r - l + 1);
			}
		}
		return ans;
	}
}
