package leetcode.utils;

import java.util.Scanner;

public final class Array {

	public static int[] build(String str) {
		String[] split = str.split(",");
		int n = split.length;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(split[i]);
		}
		return nums;
	}

	public static int[][] build() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}

}
