package backup.leetcode.c1;

import java.util.HashMap;

public class RomanToInt018 {

	public static void main(String[] args) {
		String s = "III";
		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		HashMap<Character, Integer> rm = new HashMap<>();
		rm.put('I', 1);
		rm.put('V', 5);
		rm.put('X', 10);
		rm.put('L', 50);
		rm.put('C', 100);
		rm.put('D', 500);
		rm.put('M', 1000);

		int ans = 0;
		int n = s.length();
		for (int i = 0; i < n; ++i) {
			int value = rm.get(s.charAt(i));
			if (i < n - 1 && value < rm.get(s.charAt(i + 1))) {
				ans -= value;
			} else {
				ans += value;
			}
		}
		return ans;

	}
}
