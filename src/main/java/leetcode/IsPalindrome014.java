package leetcode;

/**
 * 125. 验证回文串
 */
public class IsPalindrome014 {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch)) { //移除标点
				str.append(Character.toLowerCase(ch));
			}
		}

		//双指针
		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (Character.toLowerCase(str.charAt(left)) !=
			Character.toLowerCase(str.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
