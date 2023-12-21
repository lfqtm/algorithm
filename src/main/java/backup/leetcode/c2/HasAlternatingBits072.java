package backup.leetcode.c2;

public class HasAlternatingBits072 {

	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(5));
	}

	public static boolean hasAlternatingBits(int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		System.out.println(sb.toString());
		char[] chars = sb.toString().toCharArray();
		//检查chars是否是0 1交替
		int r = 1;
		while (r < chars.length) {
			if (chars[r] == chars[r-1]) {
				return false;
			}
			r++;
		}
		return true;

	}
}
