package backup.leetcode.c2;


import java.util.Arrays;

/**
 * 2500. 删除每行中的最大值
 */
public class DeleteGreatestValue060 {

	public static void main(String[] args) {

	}

	public static int deleteGreatestValue(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int ans = 0;
		//给二维数组排序
		for (int[] ints : grid) {
			Arrays.sort(ints);
		}

		//从后往前按列遍历，确定每列的最大值累和
		for (int j = n - 1; j >= 0; j--) {
			int max = 0;
			for (int i = 0; i < m; i++) {
				max = Math.max(max, grid[i][j]);
			}
			ans += max;
		}
		return ans;

	}
}
