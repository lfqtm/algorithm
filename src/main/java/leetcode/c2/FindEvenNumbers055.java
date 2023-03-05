package leetcode.c2;

import leetcode.utils.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindEvenNumbers055 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(findEvenNumbers(Array.build("2,2,8,8,2"))));
	}

	public static int[] findEvenNumbers(int[] digits) {
		Arrays.sort(digits);
		int n = digits.length;
		Set<Integer> ans = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (i == j || j == k || k == i)
						continue;
					int t = digits[i] * 100 + digits[j] * 10 + digits[k];
					if (t >= 100 && t % 2 == 0)
						ans.add(t);
				}
			}
		}
		int len = ans.size();
		int[] ret = new int[len];
		int i = 0;
		for (Integer a : ans) {
			ret[i++] = a;
		}
		Arrays.sort(ret);
		return ret;
	}
}
