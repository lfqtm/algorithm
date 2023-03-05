package leetcode.c1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 242. 有效的字母异位词
 */
public class IsAnagram021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		char[] s_chars = s.toCharArray();
		char[] t_chars = t.toCharArray();
		Arrays.sort(s_chars);
		Arrays.sort(t_chars);

		return Arrays.equals(s_chars, t_chars);
	}
}
