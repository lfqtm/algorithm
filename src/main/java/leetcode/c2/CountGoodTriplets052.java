package leetcode.c2;

import leetcode.utils.Array;

/**
 * 1534. 统计好三元组
 */
public class CountGoodTriplets052 {

	public static void main(String[] args) {
		System.out.println(countGoodTriplets(Array.build("3,0,1,1,9,7"), 7, 2, 3));

	}

	public static int countGoodTriplets(int[] arr, int a, int b, int c) {
		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
						ans++;
				}

			}
		}
		return ans;

	}
}
