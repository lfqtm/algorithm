package backup.ky.zhuama;

import java.util.*;

public class Main2 {

	// 5 坏键盘
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char[] a = sc.nextLine().replace("_", "").toUpperCase().toCharArray();
//		char[] b = sc.nextLine().replace("_", "").toUpperCase().toCharArray();
//		Set<Character> set = new LinkedHashSet<>();
//		for (int i = 0; i < a.length; i++) {
//			set.add(a[i]);
//		}
//		for (int i = 0; i < b.length; i++) {
//			if (set.contains(b[i])) {
//				set.remove(b[i]);
//			}
//		}
//		for (Character c : set) {
//			System.out.print(c);
//		}
//
//	}

	// 4 打印沙漏
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String sign = sc.next();
//
//		int si = 0;
//		int d = 2;
//		int i;
//		for (i = 1; 2 * si - 1 <= n; i++) {
//			int ai = 1 + (i - 1) * d;
//			int an = 1 + i * d;
//			si += ai;
//			if (2 * (si + an) - 1 > n)
//				break;
//		}
//
//		int row = 1 + (i - 1) * d;
//		for (int j = 0; j < i; j++) {
//			StringBuilder sb = new StringBuilder();
//			for (int k = 0; k < j; k++) {
//				sb.append(" ");
//			}
//			for (int k = 0; k < row - j * 2; k++) {
//				sb.append(sign);
//			}
//			for (int k = 0; k < j; k++) {
//				sb.append(" ");
//			}
//			System.out.println(sb.toString());
//		}
//
//
//		// row = 5
//		for (int j = i - 2; j >= 0; j--) {
//			StringBuilder sb2 = new StringBuilder();
//			for (int k = 0; k < j; k++) {
//				sb2.append(" ");
//			}
//			for (int k = 0; k < row - j * 2; k++) {
//				sb2.append(sign);
//			}
//			for (int k = 0; k < j; k++) {
//				sb2.append(" ");
//			}
//			System.out.println(sb2.toString());
//		}
//
//
//	}

	// 3 组个最⼩数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] a = new int[10];
//		String nums = sc.nextLine().replace(" ", "");
//		for (int i = 0; i < nums.length(); i++) {
//			a[nums.charAt(i) - '0']++;
//		}
//		int t = 0; // 保存第一个大于0的值
//		int ans = 0; // 结果数
//		for (int i = 1; i < 10; i++) {
//			if (a[i] != 0) {
//				ans = i;
//				t = i;
//				a[i] -= 1;
//				break;
//			}
//		}
//
//		for (int i = 0; i <= t; i++) {
//			if (a[i] != 0) {
//				for (int j = 0; j < a[i]; j++) {
//					ans = ans * 10 + i;
//				}
//			}
//		}
//
//		for (int i = t + 1; i < 10; i++) {
//			if (a[i] != 0) {
//				for (int j = 0; j < a[i]; j++) {
//					ans = ans * 10 + i;
//				}
//			}
//
//		}
//		System.out.println(ans);
//	}

	//2 各位数统计
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] ans = new int[10];
//		String sn = String.valueOf(n);
//		for (int i = 0; i < sn.length(); i++) {
//			ans[sn.charAt(i) - '0']++;
//		}
//
//		for (int i = 0; i < ans.length; i++) {
//			if (ans[i] != 0)
//				System.out.printf("%d:%d\n", i, ans[i]);
//		}
//	}

	// 1 部分a+b
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int da = sc.nextInt();
//		int b = sc.nextInt();
//		int db = sc.nextInt();
//
//		String sa = String.valueOf(a);
//		String sb = String.valueOf(b);
//
//		int pa = 0;
//		int count = 0;
//		for (int i = 0; i < sa.length(); i++) {
//			if (sa.charAt(i) - '0' == da)
//				count++;
//		}
//		for (int i = 0; i < count; i++) {
//			pa = 10 * pa + da;
//		}
//
//		count = 0;
//		int pb = 0;
//		for (int i = 0; i < sb.length(); i++) {
//			if (sb.charAt(i) - '0' == db)
//				count++;
//		}
//		for (int i = 0; i < count; i++) {
//			pb = 10 * pb + db;
//		}
//		System.out.println(pa + pb);
//	}
}
