package backup.ky.carl.two_pointers;

import java.util.Arrays;

public class ReverseWord {
	public static void main(String[] args) {
		String s = "  hello world  ";
		reverseWords(s);
	}

	public static void reverseWords(String s) {
		//空格移除
		s = s.trim();
		//整体翻转
		char[] chars = s.toCharArray();
		int l = 0, r = s.length() - 1;
		while (l < r) {
			swap(chars, l, r);
			l++;
			r--;
		}
		System.out.println(Arrays.toString(chars));
		//单词拼接+翻转
		StringBuilder builder = new StringBuilder();




	}

	public static void reverse() {

	}

	public static void swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}
}
