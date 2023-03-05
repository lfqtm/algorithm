package leetcode.c1;

import java.util.Arrays;

/**
 * 350. 两个数组的交集 II
 */
public class Intersect024 {

	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 2};
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int n1 = nums1.length, n2 = nums2.length;
		int[] r = new int[Math.min(n1, n2)];
		int p = 0, p1 = 0, p2 = 0;
		while (p1 < n1 && p2 < n2) {
			int num1 = nums1[p1], num2 = nums2[p2];
			if (num1 == num2) {
				r[p++] = num1;
				p1++;
				p2++;
			} else if (num1 > num2) {
				p2++;
			} else {
				p1++;
			}
		}
		return Arrays.copyOfRange(r, 0, p);

	}
}
