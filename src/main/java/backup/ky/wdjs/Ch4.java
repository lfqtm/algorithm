package backup.ky.wdjs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ch4 {

	/**
	 * 4.5 字母统计
	 */
	public void solve4_5() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Map<Character, Integer> hash = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cur = str.charAt(i);
			if ('A' <= cur && cur <= 'Z') {
				if (hash.containsKey(cur)) {
					hash.put(cur, hash.get(cur) + 1);
				} else {
					hash.put(cur, 1);
				}
			}
		}

		Set<Character> set = hash.keySet();
		set.stream().sorted().forEach(c -> {
			System.out.println(c + ":" + hash.get(c));
		});

	}

	/**
	 * 4.3 统计字符
	 */
	public void solve4_4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.nextLine();
			if ("#".equals(s)) {
				break;
			}
			String word = sc.nextLine();
			Map<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < word.length(); i++) {
				char cur = word.charAt(i);
				if (s.indexOf(cur) != -1) {
					if (map.containsKey(cur)) {
						map.put(cur, map.get(cur) + 1);
					} else {
						map.put(cur, 1);
					}
				}
			}
			Set<Character> keySet = map.keySet();
			for (Character ch : keySet) {
				System.out.println(ch + " " + map.get(ch));
			}

		}
	}

	/**
	 * 4.2 密码翻译
	 */
	public void solve4_2() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] chars = word.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'z' || chars[i] == 'Z') {
				chars[i] -= 25;
			} else if (('A' <= chars[i] && chars[i] <= 'Y') ||
				('a' <= chars[i] && chars[i] <= 'y')) {
				chars[i]++;
			}
		}
		System.out.println(String.valueOf(chars));
	}

	/**
	 * 4.1 特殊乘法
	 */
	public void solve4_1() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
//				sum += Character.getNumericValue(a.charAt(i)) * Character.getNumericValue(b.charAt(j));
				sum += (a.charAt(i) - '0') * (b.charAt(j) - '0');
			}
		}
		System.out.println(sum);
	}
}
