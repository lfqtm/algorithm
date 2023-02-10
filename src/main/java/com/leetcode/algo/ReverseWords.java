package com.leetcode.algo;

public class ReverseWords {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));

	}

	public static String reverseWords(String s) {
		char[] chars = s.toCharArray();
		int l = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				reverse(chars, l, i - 1);
				l = i + 1;
			}
		}


		return String.valueOf(chars);
	}

	public static void reverse(char[] chars, int l, int r) {
		char temp;
		while (l < r) {
			temp = chars[l];
			chars[l] = chars[r];
			chars[r] = temp;
			l++;
			r--;
		}
	}

}
