package backup.leetcode.c1;

/**
 * 345. 反转字符串中的元音字母
 */
public class ReverseVowels015 {

	public static void main(String[] args) {

		System.out.println(reverseVowels("backup/leetcode"));
	}

	public static String reverseVowels(String s) {
		int n = s.length();
		int l = 0, r = n - 1;
		char[] chars = s.toCharArray();
		while (l < r) {
			while (!isVowel(chars[l]) && l < n)
				l++;
			while (!isVowel(chars[r]) && r > 0)
				r--;
			if (l < r) {
				swap(chars, l++, r--);
			}
		}
		return new String(chars);
	}

	public static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch) >= 0;
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
