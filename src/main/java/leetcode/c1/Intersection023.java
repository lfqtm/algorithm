package leetcode.c1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 349. 两个数组的交集
 */
public class Intersection023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(",");
		String[] b = sc.nextLine().split(",");
		int n1 = a.length;
		int n2 = b.length;
		int[] nums1 = new int[n1];
		int[] nums2 = new int[n2];
		for (int i = 0; i < n1; i++) {
			nums1[i] = Integer.parseInt(a[i]);
		}
		for (int i = 0; i < n2; i++) {
			nums2[i] = Integer.parseInt(b[i]);
		}
		System.out.println(Arrays.toString(intersection(nums1, nums2)));

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int n1 = nums1.length;
		int n2 = nums2.length;
		int[] r = new int[n1 + n2];
		int p = 0, p1 = 0, p2 = 0;
		while (p1 < n1 && p2 < n2) {
			int num1 = nums1[p1], num2 = nums2[p2];
			if (num1 == num2) {
				//判断唯一添加到r中
				if (p == 0 || r[p-1] != num1) {
					r[p++] = num1;
				}
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
