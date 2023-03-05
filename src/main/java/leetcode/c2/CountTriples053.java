package leetcode.c2;

import leetcode.utils.Array;

public class CountTriples053 {

	public static void main(String[] args) {
		System.out.println(countTriples(5));
	}

	public static int countTriples(int n) {
		int ans = 0;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (k*k == i*i+j*j)
						ans++;
				}
			}
		}
		return ans;

	}
}
