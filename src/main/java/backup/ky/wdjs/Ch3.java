package backup.ky.wdjs;

import java.util.Arrays;
import java.util.Scanner;

public class Ch3 {

	/**
	 * 3.5 查找
	 */
	public void solve3_5() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);

		int n2 = sc.nextInt();
		int[] nums2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			nums2[i] = sc.nextInt();
		}

		for (int num : nums2) {
			if (binarySearch(nums, num) == -1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}


	}

	/**
	 * 3.4 找x（查找）
	 */
	public void solve3_4() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(binarySearch(nums, x));
	}

	//二分
	private int binarySearch(int[] nums, int x) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] > x)
				r = mid - 1;
			else if (nums[mid] < x)
				l = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	/**
	 * 3.2 成绩排序
	 */
	public void solve3_2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //数组长度
		int[][] grade = new int[n][2];
		for (int i = 0; i < n; i++) {
			grade[i][0] = sc.nextInt();
			grade[i][1] = sc.nextInt(); //分数
		}

		Arrays.sort(grade, (o1,o2) -> o1[1] - o2[1]); //按分数正序（由小到大）排序

		for (int[] num : grade) {
			System.out.println(num[0] + " " + num[1]);
		}
	}

	/**
	 * 3.1 输入后倒序排序
	 */
	public void solve3_1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		reverse(nums, 0, n - 1);
		System.out.println(Arrays.toString(nums));
	}

	//数组逆置
	public void reverse(int[] nums, int l, int r) {
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
