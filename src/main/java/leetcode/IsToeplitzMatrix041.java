package leetcode;

import java.util.Scanner;

/**
 * 766. 托普利茨矩阵 每一条由左上到右下的对角线上的元素都相同
 */
public class IsToeplitzMatrix041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println(isToeplitzMatrix(mat));
	}

	public static boolean isToeplitzMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		//遍历矩阵，判断左上角元素与该元素相等
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] != matrix[i - 1][j - 1])
					return false;
			}
		}
		return true;
	}
}
