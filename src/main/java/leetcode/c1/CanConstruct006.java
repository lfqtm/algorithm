package leetcode.c1;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. 赎金信 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 */
public class CanConstruct006 {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";

		System.out.println(canConstruct(ransomNote, magazine));

	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> source = new HashMap<>();
		//统计字符个数
		for (int i = 0; i < magazine.length(); i++) {
			char c = magazine.charAt(i);
			int count = source.getOrDefault(c, 0);
			source.put(c, ++count);
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);
			int count = source.getOrDefault(c, 0);
			if (--count >= 0)
				source.put(c, count);
			else
				return false;
		}
		return true;

	}
}
