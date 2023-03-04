package leetcode;

import leetcode.utils.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1337. 矩阵中战斗力最弱的 K 行
 */
public class KWeakestRows45 {

	public static void main(String[] args) {
//		int[][] mat = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
		int[][] mat = Array.build();
		System.out.println(Arrays.toString(kWeakestRows(mat, 3)));
	}

	public static int[] kWeakestRows(int[][] mat, int k) {
		int m = mat.length;
		int[] nums = new int[m];
		//对每行元素累和
		int i = 0;
		for (int[] col : mat) {
			nums[i++] = Arrays.stream(col).sum();
		}
		//nums与下标构成二维数组
		int[][] grid = new int[m][2];
		for (int j = 0; j < i; j++) {
			grid[j][0] = nums[j];
			grid[j][1] = j;
		}
		//将二维数组按一行元素排序
		Arrays.sort(grid, Comparator.comparingInt(a -> a[0]));
		int[] ans = new int[k];
		for (int j = 0; j < k; j++) {
			ans[j] = grid[j][1];
		}
		return ans;

	}
}
