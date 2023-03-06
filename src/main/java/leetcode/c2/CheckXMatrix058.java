package leetcode.c2;

import leetcode.utils.Array;

/**
 * 2319. 判断矩阵是否是一个 X 矩阵
 */
public class CheckXMatrix058 {

	public static void main(String[] args) {
		System.out.println(checkXMatrix(Array.build()));
	}

	public static boolean checkXMatrix(int[][] grid) {
		int n = grid.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					if (grid[i][j] == 0)
						return false;
				} else {
					if (grid[i][j] != 0)
						return false;
				}
			}
		}
		return true;
	}
}
