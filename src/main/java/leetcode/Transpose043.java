package leetcode;

import leetcode.utils.Array;

import java.util.Arrays;

public class Transpose043 {

	public static void main(String[] args) {
		int[][] mat = Array.build();
		System.out.println(Arrays.deepToString(transpose(mat)));
	}

	public static int[][] transpose(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] tans = new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				tans[j][i] = matrix[i][j];
			}
		}
		return tans;
	}
}
