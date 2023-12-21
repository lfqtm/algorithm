package backup.leetcode.c1;

import backup.leetcode.utils.Array;

/**
 * 1572. 矩阵对角线元素的和
 */
public class DiagonalSum048 {

	public static void main(String[] args) {
		System.out.println(diagonalSum(Array.build()));
	}

	public static int diagonalSum(int[][] mat) {
		int m = mat.length;

		int suma = mat[0][0];
		for (int i = 1; i < m; i++) {
			suma += mat[i][i];
		}

		int sumb = mat[0][m - 1];
		int j = 1;
		for (int i = m - 2; i >= 0; i--) {
			sumb += mat[j++][i];
		}
		int sum = suma + sumb;

		if (m % 2 != 0)
			sum -= mat[m / 2][m / 2];
		return sum;

	}
}
