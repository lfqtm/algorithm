package wdjs;

import java.util.Scanner;

public class Ch2 {

	/**
	 * 2.11 xx定律
	 */
	public void solve2_11() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int count = 0;
			while (n != 1 && n != 0) {
				if (n % 2 == 0)
					n /= 2;
				else {
					n = (3 * n + 1) / 2;
				}
				count++;
			}
			System.out.println(count);
		}
	}

	/**
	 * 2.6 年月日计算本年第几天
	 */
	public void solve2_6() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			int[][] dayTable = new int[][]{
				{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
			};
			boolean flag = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			int row = flag ? 1 : 0;
			int number = 0;
			for (int i = 0; i < month; i++) { //将月份换算成天数
				number += dayTable[row][i];
			}
			number += day;
			System.out.println(number);
		}
	}

	/**
	 * 2.4打印梯形
	 */
	public void solve2_4() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //高度，上底长度
		//下底长度
		int l = n;
		for (int i = 1; i < n; i++) {
			l += 2;
		}
		//遍历
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				if (j < l - n - 2 * i) { // 每行多两个*
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}


	}

	/**
	 * 2.3 对称平方和
	 */
	public void solve2_3() {
		for (int i = 0; i <= 256; i++) {
			int x = i * i;
			if (x == rev(x))
				System.out.println(i);
		}
	}

	//逆置整数
	private int rev(int num) {
		int ans = 0;
		while (num != 0) {
			ans *= 10;
			ans += num % 10;
			num /= 10;
		}
		return ans;
	}

	/**
	 * 2.1 abc
	 */
	public void solve2_1() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 9; k++) {
					if (100 * i + 110 * j + 12 * k == 532) {
						System.out.printf("%d %d %d\n", i, j, k);
					}
				}
			}
		}
	}

	/**
	 * 2.2 反序数
	 */
	public void solve2_2() {
		for (int i = 1000; i < 10000; i++) {
			if (i * 9 == reverse(i))
				System.out.println(i);
		}
	}

	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			rev *= 10;
			rev += x % 10;
			x /= 10;
		}
		return rev;
	}

}
