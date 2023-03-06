package leetcode.c2;

import leetcode.utils.Array;

import java.util.HashSet;
import java.util.Set;

public class CheckValid057 {

	public static void main(String[] args) {
		System.out.println(checkValid(Array.build()));
	}

	public static boolean checkValid(int[][] matrix) {
		int n = matrix.length;
		//哈希表
		//遍历元素是分别记录行列数据并存放到hash表中
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				set1.add(matrix[i][j]); // 行
				set2.add(matrix[j][i]); // 列
			}
			if (set1.size() != n || set2.size() != n)
				return false;
			set1.clear();
			set2.clear();
		}
		return true;

	}
}
