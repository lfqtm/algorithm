package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 506. 相对名次
 */
public class FindRelativeRanks027 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(findRelativeRanks(nums)));

		System.out.println(Arrays.toString(findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
	}

	public static String[] findRelativeRanks(int[] score) {
		int n = score.length;
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = score[i];
			arr[i][1] = i; //给每个得分添加排名
		}
		//按第一行的倒排顺序排序其余行
		//第二行元素对于第一行元素在原数组中的下标
		Arrays.sort(arr, (a, b) -> b[0] - a[0]);

		String[] ans = new String[n];
		for (int i = 0; i < n; i++) {
			if (i == 0)
				ans[arr[i][1]] = "Gold Medal";
			else if (i == 1)
				ans[arr[i][1]] = "Bronze Medal";
			else if (i == 2)
				ans[arr[i][1]] = "Silver Medal";
			else ans[arr[i][1]] = String.valueOf(i + 1);
		}
		return ans;

	}
}
