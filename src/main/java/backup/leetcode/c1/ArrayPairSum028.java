package backup.leetcode.c1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * 561. 数组拆分
 */
public class ArrayPairSum028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(arrayPairSum(nums));

	}

	public static int arrayPairSum(int[] nums) {
		//对原数组进行升序排序，从0开始每隔一个元素进行一次划分，可得到最优分法
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
}
