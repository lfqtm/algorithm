package leetcode;

import leetcode.utils.Array;

import java.util.Arrays;

/**
 * 832. 翻转图像
 */
public class FlipAndInvertImage042_2 {

	public static void main(String[] args) {
		int[][] mat = Array.build();
		System.out.println(Arrays.deepToString(flipAndInvertImage(mat)));

	}

	public static int[][] flipAndInvertImage(int[][] image) {
		for (int[] ints : image) {
			reverse(ints, 0, ints.length - 1);
		}
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				if (image[i][j] == 0) {
					image[i][j] = 1;
				} else {
					image[i][j] = 0;
				}
			}
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
