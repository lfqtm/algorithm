package wdjs;

import java.util.Scanner;

public class Ch6 {



	/**
	 * 6.8 素数 输出从0-n的所有素数
	 */
	public void solve6_8() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			if (i % 10 == 1 && isPrime(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	// 判断是否为素数
	public boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

	/**
	 * 6.7 质数判断（又称为素数）
	 *
	 * 只需要判断 2到sqrt(n)的数是否能将n整除
	 */
	public void solve6_7() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}

	/**
	 * 最小公倍数lcm
	 *
	 * 求最小公倍数借助最大公约数，若已知最大公约数为g，那么a与b这两个数的最小公倍数是 a*b/g
	 */
	public void solve6_6() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a * b / gcd2(a, b));

	}

	public int gcd2(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd2(b, a % b);
		}
	}

	/**
	 * 6.5 最大公约数gcd 辗转相除法
	 */
	public void solve6_5() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a, b));

	}

	/**
	 * 欧几里得算法求最大公约数，辗转相除法
	 */
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	/**
	 * 6.3 十进制和二进制 先转为二进制 再逆序排序 再转换成十进制
	 */
	public void solve6_3() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		char[] chars = sb.toString().toCharArray();
		reverse(chars);
		int ans = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			if (chars[i] == '1') {
				ans += (Math.pow(2, i));
			}
		}
		System.out.println(ans);
	}

	/**
	 * 6.1 二进制数（十进制转二进制）
	 */
	public void solve6_1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		char[] chars = sb.toString().toCharArray();
		reverse(chars);
		System.out.println(Integer.parseInt(String.valueOf(chars)));

	}

	public void reverse(char[] chars) {
		int l = 0, r = chars.length - 1;
		while (l < r) {
			char tmp = chars[l];
			chars[l] = chars[r];
			chars[r] = tmp;
			l++;
			r--;
		}
	}
}
