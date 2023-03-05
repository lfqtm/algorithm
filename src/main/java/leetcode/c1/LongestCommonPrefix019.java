package leetcode.c1;

/**
 * 14. 最长公共前缀
 */
public class LongestCommonPrefix019 {

	public static void main(String[] args) {
//		String[] strs = new String[]{"flower", "flow", "flight"};
		String[] strs = new String[]{"dog", "flow", "flight"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		int n = strs.length;
		if (n == 0) {
			return "";
		}
		String prefix = strs[0];
		for (int i = 1; i < n; i++) {
			prefix = prefix(prefix, strs[i]);
		}
		return prefix;

	}

	public static String prefix(String str1, String str2) {
		int len = Math.min(str1.length(), str2.length());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				sb.append(str1.charAt(i));
			} else {
				break;
			}
		}
		return sb.toString();
	}
}
