package backup.leetcode.c2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 剑指 Offer 15. 二进制中1的个数
 */
public class HammingWeight071 {

	public static void main(String[] args) {
		System.out.println(hammingWeight(-3));

	}

	public static int hammingWeight(int n) {
//		StringBuilder sb = new StringBuilder();
//		while (n != 0) {
//			sb.append(n % 2);
//			n /= 2;
//		}
//		char[] chars = sb.toString().toCharArray();
//		int ans = 0;
//		for (char ch : chars) {
//			if (ch == '1') {
//				ans++;
//			}
//		}
//		return ans;
		int ret = 0;
		while (n != 0) {
			n &= n - 1;
			ret++;
		}
		return ret;

	}
}
