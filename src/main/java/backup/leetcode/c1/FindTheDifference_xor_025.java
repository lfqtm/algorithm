package backup.leetcode.c1;

import java.util.Scanner;

/**
 * 389. 找不同
 */
public class FindTheDifference_xor_025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {
		//异或
		//s在t中均有数据，唯一多出的char是被添加的
		char xor = 0;
		String combine = s.concat(t);
		System.out.println("combine = " + combine);
		for (char c : combine.toCharArray()) {
			xor ^= c;
		}
		return xor;
	}
}
