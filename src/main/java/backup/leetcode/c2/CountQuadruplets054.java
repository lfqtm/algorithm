package backup.leetcode.c2;

import backup.leetcode.utils.Array;

public class CountQuadruplets054 {

	public static void main(String[] args) {
		System.out.println(countQuadruplets(Array.build("1,2,3,6")));
	}

	public static int countQuadruplets(int[] nums) {
		int n = nums.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {
						if (nums[i] + nums[j] + nums[k] == nums[l])
							ans++;
					}

				}
			}
		}
		return ans;
	}
}
