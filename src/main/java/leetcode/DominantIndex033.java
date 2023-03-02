package leetcode;

import leetcode.utils.Array;

/**
 * 747. 至少是其他数字两倍的最大数
 */
public class DominantIndex033 {


	public static void main(String[] args) {
		System.out.println(dominantIndex(Array.build("3,6,1,0")));
	}

	public static int dominantIndex(int[] nums) {
		//一次遍历找最大值和最小值
		int m1 = -1, m2 = -1;
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > m1) {
				m2 = m1;
				m1 = nums[i];
				index = i;
			} else if (nums[i] > m2) {
				m2 = nums[i];
			}
		}
		return m1 >= m2 * 2 ? index : -1;

	}
}
