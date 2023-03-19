package nn;

import java.util.*;

public class Main {

	// 整除
//	public static void main(String[] args) {
//		List<Integer> ans = new ArrayList<>();
//		for (int i = 101; i < 1000; i++) {
//			if (i % 5 == 0 && i % 6 == 0) {
//				ans.add(i);
//			}
//		}
//
//		for (int i = 0; i < ans.size(); i++) {
//			if (i != 0 && i % 10 == 0)
//				System.out.println();
//			if (i % 10 != 0)
//				System.out.print(" ");
//
//			System.out.print(ans.get(i));
//		}
//
//	}

	// 字符串翻转
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		char[] chars = a.toCharArray();
//		int l = 0, r = chars.length - 1;
//		while (l < r) {
//			char tmp = chars[l];
//			chars[l] = chars[r];
//			chars[r] = tmp;
//			l++;
//			r--;
//		}
//		for (char c : chars) {
//			System.out.print(c);
//		}
//	}

	// 计算sn
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int n = sc.nextInt();
//
//		int sum = 0;
//		int ai = 0;
//		for (int i = 0; i < n; i++) {
//			ai = ai * 10 + a;
//			sum += ai;
//		}
//		System.out.print(sum);
//	}
}
