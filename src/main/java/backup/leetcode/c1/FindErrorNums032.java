package backup.leetcode.c1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 645. 错误的集合
 */
public class FindErrorNums032 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(findErrorNums(nums)));
		System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
	}

	public static int[] findErrorNums(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int[] ans = new int[2];
		int l = 0;
		for (int r = 1; r < n; r++) {
			if (nums[l] == nums[r]) {
				ans[0] = nums[l]; //重复值
				break;
			}
			l++;
		}

		//异或
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		int xor = 0;
		for (int i = 0; i < n; i++) {
			xor ^= nums[i];
			xor ^= arr[i];
		}
		ans[1] = xor ^ ans[0];
		return ans;
	}
}
