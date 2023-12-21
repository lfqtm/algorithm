package backup.leetcode.c1;

import backup.leetcode.utils.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 1260. 二维网格迁移
 */
public class ShiftGrid44 {

	public static void main(String[] args) {
		int[][] mat = Array.build();
//		int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(shiftGrid(mat, 1));
	}

	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
		int m = grid.length;
		int n = grid[0].length;
		int count = m * n;
		int[] nums = new int[count];
		//将二维数组转化为一维数组
		for (int i = 0; i < count; i++) {
			nums[i] = grid[i / n][i % n];
		}
		//一维数组迁移k次是指将最后的k位元素移动到前面k位
		int len = nums.length;
		int[] ans = new int[len];
		for (int i = 0; i < len; i++) {
			ans[(i + k) % len] = nums[i];
		}
		for (int i = 0; i < count; i++) {
			grid[i / n][i % n] = ans[i];
		}

		List<List<Integer>> re = new ArrayList<>(m);
		for (int[] col : grid) {
			List<Integer> c = new ArrayList<>(n);
			for (int value : col) {
				c.add(value);
			}
			re.add(c);
		}

		return re;
	}
}
