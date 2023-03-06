package leetcode.c2;

import leetcode.utils.Array;

/**
 * 121. 买卖股票的最佳时机
 */
public class MaxProfit062 {

	public static void main(String[] args) {
		System.out.println(maxProfit(Array.build("7,1,5,3,6,4")));
	}

	public static int maxProfit(int[] prices) {
		int n = prices.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int profit = prices[j] - prices[i];
				if (profit > ans) {
					ans = profit;
				}
			}
		}
		return ans;
	}
}
