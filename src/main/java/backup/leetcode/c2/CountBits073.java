package backup.leetcode.c2;

import java.util.Arrays;

public class CountBits073 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(2)));
	}

	public static int[] countBits(int n) {
		int[] ans = new int[n + 1];
		int j;
		for (int i = 0; i <= n; i++) {
			j = i;
			int count = 0;
			while (j != 0) {
				if (j % 2 == 1) {
					count++;
				}
				j /= 2;
			}
			ans[i] = count;
		}
		return ans;
	}
}
