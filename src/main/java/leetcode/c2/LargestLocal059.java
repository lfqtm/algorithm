package leetcode.c2;

import leetcode.utils.Array;

import java.util.Arrays;

/**
 * 2373. 矩阵中的局部最大值
 */
public class LargestLocal059 {

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(largestLocal(Array.build())));
	}

	public static int[][] largestLocal(int[][] grid) {
		int n = grid.length;
		int[][] ans = new int[n - 2][n - 2];
		for (int i = 0; i < n - 2; i++) {
			for (int j = 0; j < n - 2; j++) {
				//遍历3*3的矩阵
				for (int k = i; k < i + 3; k++) {
					for (int l = j; l < j + 3; l++) {
						ans[i][j] = Math.max(ans[i][j], grid[k][l]);
					}

				}
			}
		}
		return ans;
	}
}
