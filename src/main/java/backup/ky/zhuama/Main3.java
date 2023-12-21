package backup.ky.zhuama;

import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a + b);
	}

	// 朋友数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//
//		Set<Integer> ans = new TreeSet<>();
//		for (int i = 0; i < n; i++) {
//			//各位数的和
//			int sum = 0;
//			int a = nums[i];
//			while (a != 0) {
//				sum += a % 10;
//				a /= 10;
//			}
//			ans.add(sum);
//		}
//		System.out.print(ans.size() + "\n");
//		//treeset输出是有序的
//		int i = 0;
//		for (Integer a : ans) {
//			if (i != 0) {
//				System.out.print(" ");
//			}
//			i++;
//			System.out.print(a);
//		}
//
//
//	}

	// 最简分数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] fs1 = sc.next().split("/");
//		String[] fs2 = sc.next().split("/");
//		int m = sc.nextInt();
//
//		int[] a = new int[2];
//		int[] b = new int[2];
//		for (int i = 0; i < 2; i++) {
//			a[i] = Integer.parseInt(fs1[i]);
//			b[i] = Integer.parseInt(fs2[i]);
//		}
//		System.out.println(simple(a, b, m));
//	}
//
//	public static List<String> simple(int[] a, int[] b, int m) {
//		if (a[0] * b[1] > a[1] * b[0]) {
//			//a > b 则交换
//			int[] tmp = a;
//			a = b;
//			b = tmp;
//		}
//		int num = 1;
//		while () {
//
//		}
//
//	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	// 爱丁顿数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		Arrays.sort(nums);
//		reverse(nums);
//
//		int ans = 0, i = 0;
//		while (ans <= n && nums[i] > i + 1) {
//			ans++;
//			i++;
//		}
//		System.out.print(ans);
//	}

	public static void reverse(int[] arr) {
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}

	}

	// 组合数的和
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		// 数组中的数 出现在个位和十位的次数都是两次
//		int sum = 0;
//		for (int i = 0; i < n; i++) {
//			sum += nums[i] * (n - 1) + nums[i] * 10 * (n - 1);
//		}
//		System.out.print(sum);
//	}

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
