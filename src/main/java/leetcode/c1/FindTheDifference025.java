package leetcode.c1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 389. 找不同
 */
public class FindTheDifference025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				return c1[i];
		}
		return c2[c2.length - 1];
	}
}
