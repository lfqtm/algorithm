package nn;

import java.util.*;

/**
 * n诺刷题笔记
 */
public class Main {

	// 删除字符串2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ins = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ins.length(); i++) {
			char cur = ins.charAt(i);
			if (cur == 'g' || cur == 'G') {
				if (ins.substring(i, i + 3).toUpperCase().equals("GZU")) {
					i += 2;
					continue;
				}
			}
			sb.append(cur);
		}
		System.out.print(sb.toString());
	}

	// 反序数
//	public static void main(String[] args) {
//		int n = 1;
//		while (reverse(n) != 9 * n) {
//			n++;
//		}
//		System.out.print(n);
//	}

	/**
	 * 数字n逆序
	 *
	 * @param n 输入
	 * @return 输出
	 */
	public static int reverse(int n) {
		int ans = 0;
		while (n != 0) {
			ans *= 10;
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}

	// 加密算法
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String ins = sc.nextLine();
//		for (int i = 0; i < ins.length(); i++) {
//			char cur = ins.charAt(i);
//			if (cur == ' ' || (cur >= 48 && cur <= 57))
//				System.out.print(cur);
//			else
//				System.out.print((char) (cur + 3));
//		}
//	}

	// 判断素数
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while (!isPrime(n)) {
//			n++;
//		}
//		System.out.print(n);
//	}

	/**
	 * 判断是否是质数
	 *
	 * @param n 输入
	 * @return 输出
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// 日期
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int y = sc.nextInt();
//		int r = sc.nextInt();
//
//		int[] yf = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		String[] xq = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//		// 求4月12到输入的月份和日期的天数
//		int days = 0;
//		while (y >= 4) {
//			if (y == 4)
//				days = r - 12;
//			else
//				days += yf[y-1];
//			y--;
//		}
//		int index = days % 7;
//		System.out.print(xq[(3 + index) % 7]);
//	}

	// 字符移动 ab4f35gr#a6
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String ins = sc.next();
//		char[] incs = ins.toCharArray();
//		int csc = 0;
//		for (char ci : incs) {
//			if (!(ci >= 48 && ci <= 57)) {
//				csc++;
//			}
//		}
//		char[] ans = new char[incs.length];
//		int cp = 0;
//		for (char ci : incs) {
//			if (ci >= 48 && ci <= 57) {
//				ans[csc++] = ci;
//			} else {
//				ans[cp++] = ci;
//			}
//		}
//		for (char an : ans) {
//			System.out.print(an);
//		}
//	}

	// 数字统计
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNextLine()) {
//			String[] ins = sc.nextLine().split(" ");
//			int l = Integer.parseInt(ins[0]);
//			int r = Integer.parseInt(ins[1]);
//			int c = 0; //count
//			for (int i = l; i <= r; i++) {
//				char[] cs = String.valueOf(i).toCharArray();
//				for (char value : cs) {
//					if (value == '2')
//						c++;
//				}
//			}
//			System.out.println(c);
//		}
//	}

	// 排序
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}

	//法一：遍历
//		int[] ans = new int[n];
//		int idx = 0;
//		for (int i = 0; i < n; i++) {
//			if ((i + 1) % 2 == 1)
//				ans[idx++] = nums[i];
//		}
//		int cur = idx;
//		for (int i = 0; i < n; i++) {
//			if ((i + 1) % 2 == 0)
//				ans[cur++] = nums[i];
//		}

	//法二：先求奇数位个数
//		int[] ans = new int[n];
//		int odd = 0;
//		int even = 0;
//		if (n % 2 == 1)
//			odd = (n + 1) / 2;
//		else
//			even = n / 2;
//		int cur = even;
//		for (int i = 0; i < n; i++) {
//			if ((i + 1) % 2 == 1)
//				ans[odd++] = nums[i];
//			else
//				ans[even++] = nums[i];
//		}
//		Arrays.sort(ans, cur, n - 1);
//		for (int i = 0; i < n; i++) {
//			if (i != 0)
//				System.out.print(" ");
//			System.out.print(ans[i]);
//		}
//	}

	// 求1到n的和
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.print((1 + n) / 2 * n);
//	}

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
