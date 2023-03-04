package leetcode;

import leetcode.utils.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 1380. 矩阵中的幸运数
 */
public class LuckyNumbers047 {

	public static void main(String[] args) {

		System.out.println(luckyNumbers(Array.build()));

	}

	public static List<Integer> luckyNumbers(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		//找行中最小的元素构成一个数组
		int[] a = new int[m];
		int i = 0;
		for (int[] col : matrix) {
			int min = Integer.MAX_VALUE;
			for (int c : col) {
				min = Math.min(c, min);
			}
			a[i++] = min;
		}

		//找所有列中最大的元素构成一个数组
		int[] b = new int[n];
		for (int j = 0; j < n; j++) {
			int max = Integer.MIN_VALUE;
			for (int k = 0; k < m; k++) {
				max = Math.max(matrix[k][j], max);
			}
			b[j] = max;
		}

		//两个数组的都出现的元素
		List<Integer> ans = new ArrayList<>();
		for (int i1 : a) {
			for (int i2 : b) {
				if (i1 == i2)
					ans.add(i1);
			}
		}
		return ans;

	}
}
