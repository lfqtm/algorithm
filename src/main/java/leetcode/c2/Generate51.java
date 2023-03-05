package leetcode.c2;

import java.util.ArrayList;
import java.util.List;

public class Generate51 {

	public static void main(String[] args) {

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
				}
			}
			ret.add(row);
		}
		return ret;
	}
}
