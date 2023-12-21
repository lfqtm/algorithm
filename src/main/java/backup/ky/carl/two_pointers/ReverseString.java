package backup.ky.carl.two_pointers;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		char[] s = "hello".toCharArray();
		reverseString(s);

	}

	public static void reverseString(char[] s) {
		//双端指针
		int l = 0, r = s.length - 1;
		while (l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}

		System.out.println(Arrays.toString(s));
	}
}
