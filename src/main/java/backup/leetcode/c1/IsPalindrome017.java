package backup.leetcode.c1;

/**
 * 9. 回文数
 */
public class IsPalindrome017 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		char[] chars = String.valueOf(x).toCharArray();
		int n = chars.length;
		for (int i = 0; i < n; i++) {
			if (chars[i] != chars[n - 1 - i])
				return false;
		}
		return true;
	}
}
