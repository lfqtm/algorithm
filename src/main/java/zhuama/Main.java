package zhuama;

import java.util.*;

public class Main {

	public static void main(String[] args) {

	}

	//☆☆ 2 个位数统计
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int[] a = new int[10];
//		for (int i = 0; i < s.length(); i++) {
//			a[s.charAt(i) - '0']++; //char对应的整数值，char转int
//		}
//		for (int i = 0; i < 10; i++) {
//			if (a[i] != 0)
//				System.out.printf("%d:%d\n", i, a[i]);
//		}
//	}

	//2 个位数统计
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		Map<String, Integer> map = new HashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			String key = s.charAt(i) + "";
//			if (map.containsKey(key)) {
//				map.put(key, map.get(key) + 1);
//			} else {
//				map.put(key, 1);
//			}
//		}
//		for (int i = 0; i < 10; i++) {
//			if (map.containsKey(i + "")) {
//				System.out.println(i + ":" + map.get(i + ""));
//			}
//		}
//	}

	//1 部分a+b
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int da = sc.nextInt();
//		int b = sc.nextInt();
//		int db = sc.nextInt();
//
//		int pa = pa(a, da);
//		int pb = pa(b, db);
//		System.out.println(pa + pb);
//	}
//
//	public static int pa(int a, int da) {
//		String sa = String.valueOf(a);
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < sa.length(); i++) {
//			if (Character.getNumericValue(sa.charAt(i)) == da)
//				sb.append(da);
//		}
//		if (sb.length() == 0)
//			return 0;
//		else
//			return Integer.parseInt(sb.toString());
//	}
}
