package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class FindRelativeRanks027 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(findRelativeRanks(nums)));

		System.out.println(Arrays.toString(findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
	}

	public static String[] findRelativeRanks(int[] score) {
		int n = score.length;
		String[] desc = {"Gold Medal", "Silver Medal", "Bronze Medal"};
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; ++i) {
			arr[i][0] = score[i];
			arr[i][1] = i;
		}
		Arrays.sort(arr, (a, b) -> b[0] - a[0]);
		String[] ans = new String[n];
		for (int i = 0; i < n; ++i) {
			if (i >= 3) {
				ans[arr[i][1]] = Integer.toString(i + 1);
			} else {
				ans[arr[i][1]] = desc[i];
			}
		}
		return ans;

	}
}
