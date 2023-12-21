package backup.leetcode.c1;

import java.util.Arrays;

/**
 * 566. 重塑矩阵
 */
public class MatrixReshape040 {

	public static void main(String[] args) {
		int[][] mat = new int[][]{{1, 2}, {3, 4}};
		int[][] ints = matrixReshape(mat, 1, 4);
		System.out.println(Arrays.deepToString(ints));
	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		//原数组行列下标
		int m = mat.length;
		if (m == 0)
			return mat;
		int n = mat[0].length;
		//行列相等或是总数不等，直接返回
		if (r == m && c == n || r * c != m * n)
			return mat;

		int count = m * n;
		int[][] ans = new int[r][c];
		for (int i = 0; i < count; i++) {
			//两个数组拍扁应该是一样的
			ans[i / c][i % c] = mat[i / n][i % n];
		}
		return ans;
	}

	/**
	 * 将矩阵转换成一维数组
	 */
	public static void flatten() {
		int[][] mat = new int[][]{{1, 2}, {3, 4}};
		for (int i = 0; i < 4; i++) {
			System.out.println(mat[i / 2][i % 2]);
		}
	}
}
