package leetcode.c1;

/**
 * 1672. 最富有客户的资产总量
 */
public class MaximumWealth003 {

	public static void main(String[] args) {
		int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
		System.out.println(maximumWealth(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		if (accounts.length == 0 || accounts[0].length == 0) {
			return 0;
		}

		int max = 0;
		for (int i = 0; i < accounts.length; i++) {
			int line = 0;
			for (int j = 0; j < accounts[0].length; j++) {
				line += accounts[i][j];
			}
			max = max > line ? max : line;
		}
		return max;

	}
}
