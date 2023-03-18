package zhuama;

import java.util.*;

public class Main3 {

	// 28 划拳
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int time = sc.nextInt();
//		int counta = 0, countb = 0;
//		for (int i = 0; i < time; i++) {
//			//轮次
//			int a1 = sc.nextInt();
//			int a2 = sc.nextInt();
//			int b1 = sc.nextInt();
//			int b2 = sc.nextInt();
//			int count = a1 + b1;
//			if (count == a2 && count == b2)
//				continue;
//			if (count != a2 && count != b2)
//				continue;
//			if (count == a2)
//				countb++;
//			if (count == b2)
//				counta++;
//		}
//
//		System.out.printf("%d %d", counta, countb);
//	}

	// 27 有几个pat
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String line = sc.next();
//		int len = line.length();
//		int countt = 0, countp = 0;
//		// 先找出T出现的次数
//		for (int i = 0; i < len; i++) {
//			if ('T' == line.charAt(i)) {
//				countt++;
//			}
//		}
//
//		// 遇到p则countp++，遇到t则countt--
//		int ans = 0;
//		for (int i = 0; i < len; i++) {
//			if ('P' == line.charAt(i))
//				countp++;
//			if ('T' == line.charAt(i))
//				countt--;
//			if ('A' == line.charAt(i))
//				ans += (countp * countt) % 1000000007;
//		}
//		System.out.print(ans);
//	}

	// 26 跟奥巴马学编程
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String sign = sc.next();
//		int w = Math.round((float) n / 2); //宽度
//		for (int i = 0; i < w; i++) {
//			if (i == 0 || i == w - 1) {
//				for (int j = 0; j < n; j++) {
//					System.out.print(sign);
//				}
//			} else {
//				for (int j = 0; j < n; j++) {
//					if (j == 0 || j == n - 1) {
//						System.out.print(sign);;
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//			if (i != w - 1)
//				System.out.println();
//		}
//	}

	// 9 统计同成绩学生人数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[101]; //101个数组
//		for (int i = 0; i < n; i++) {
//			nums[sc.nextInt()]++;
//		}
//
//		int k = sc.nextInt();
//		int[] finds = new int[k]; //查k个成绩
//		for (int i = 0; i < k; i++) {
//			finds[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < k; i++) {
//			System.out.print(nums[finds[i]]);
//			if (i != k - 1)
//				System.out.print(" ");
//		}
//	}

}
