package backup.leetcode.c2;

import backup.leetcode.utils.Array;

import java.util.Arrays;

public class Construct2DArray056 {

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(construct2DArray(Array.build("1,2,3"), 1, 1)));
	}

	public static int[][] construct2DArray(int[] original, int m, int n) {
		int count = m * n;
		int len = original.length;
		if (count != len)
			return new int[][]{};
		int[][] ans = new int[m][n];
		for (int i = 0; i < len; i++) {
			ans[i / n][i % n] = original[i];
		}
		return ans;
	}
}
