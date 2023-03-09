package wdjs;

import java.util.Scanner;

public class Ch6 {

	/**
	 * 6.3 十进制和二进制
	 * 先转为二进制 再逆序排序
	 * 再转换成十进制
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
