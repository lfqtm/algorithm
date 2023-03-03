package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 832. 翻转图像
 */
public class FlipAndInvertImage042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(flipAndInvertImage(mat)));

	}

	public static int[][] flipAndInvertImage(int[][] image) {
		//转换成一维
		int m = image.length;
		int n = image[0].length;
		int count = m * n;
		int[] nums = new int[count];
		for (int i = 0; i < count; i++) {
			nums[i] = image[i / n][i % n];
		}
		//水平翻转
		for (int i = 0; i < count; i+=n) {
			reverse(nums, i, i + n - 1);
		}
		//反转
		for (int i = 0; i < count; i++) {
			if (nums[i] == 0)
				nums[i] = 1;
			else
				nums[i] = 0;
		}
		//还原
		for (int i = 0; i < count; i++) {
			image[i / n][i % n] = nums[i];
		}

		return image;
	}

	public static void reverse(int[] nums, int l, int r) {
		int temp = 0;
		while (l < r) {
			temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
			l++;
			r--;
		}

	}
}
