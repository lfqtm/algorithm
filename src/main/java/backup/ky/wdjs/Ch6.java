package backup.ky.wdjs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ch6 {

	/**
	 * 6.11 矩阵乘法
	 * 模拟
	 */
	public void solve6_11() {
		Scanner sc = new Scanner(System.in);
		// 2*3
		int[][] m1 = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				m1[i][j] = sc.nextInt();
			}
		}

		// 3*2
		int[][] m2 = new int[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				m2[i][j] = sc.nextInt();
			}
		}

		int[][] ans = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				//对行列乘积累和,k小于3（m1的列，m2的行）
				for (int k = 0; k < 3; k++) {
					ans[i][j] += (m1[i][k] * m2[k][j]);
				}
			}
		}

		System.out.println(Arrays.deepToString(ans));
	}

	/**
	 * 6.9 求质因子的个数
	 * 120=2*2*2*3*5
	 */
	public void solve6_9() {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		// 先获取所有小于k的质因子
		List<Integer> ls = new ArrayList<>();
		for (int i = 2; i < k; i++) {
			if (isPrime3(i)) {
				ls.add(i);
			}
		}
		int size = ls.size();
		int[] nums = new int[size];
		//生成质因子数组
		for (int i = 0; i < size; i++) {
			nums[i] = ls.get(i);
		}

		int count = 0;
		while (k != 1) {
			int d = divByPrime(nums, k);
			if (k % d == 0) {
				count++;
				k /= d;
			}
		}

		System.out.println(count);

	}

	/**
	 * 从大往小在质因子中找可以整除的元素
	 */
	public int divByPrime(int[] primes, int n) {
		int len = primes.length;
		for (int i = len - 1; i >= 0; i--) {
			if (n % primes[i] == 0) {
				return primes[i];
			}
		}
		return -1;

	}

	public boolean isPrime3(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i==0)
				return false;
		}
		return true;
	}

	/**
	 * 习题6.6 查找第k位
	 */
	public void solve6_6_drill() {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int i = 0;
		for (int j = 1; j < Integer.MAX_VALUE; j++) {
			if (isPrime2(j)) {
				i++;
				if (i == k) {
					System.out.println(j);
					return;
				}
			}
		}

	}

	public boolean isPrime2(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * 6.8 素数 输出从0-n的所有素数
	 */
	public void solve6_8() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			if (i % 10 == 1 && isPrime(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	// 判断是否为素数（除了1和数本身，不能被其他数据整除）
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isPrime(2));
	}

	/**
	 * 6.7 质数判断（又称为素数）
	 *
	 * 只需要判断 2到sqrt(n)的数是否能将n整除
	 */
	public void solve6_7() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}

	/**
	 * 最小公倍数lcm
	 *
	 * 求最小公倍数借助最大公约数，若已知最大公约数为g，那么a与b这两个数的最小公倍数是 a*b/g
	 */
	public void solve6_6() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a * b / gcd2(a, b));

	}

	/**
	 * 欧几里得算法求最大公约数
	 */
	public int gcd2(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd2(b, a % b);
		}
	}

	/**
	 * 6.5 最大公约数gcd 辗转相除法
	 */
	public void solve6_5() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a, b));

	}

	/**
	 * 欧几里得算法求最大公约数，辗转相除法
	 */
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	/**
	 * 6.3 十进制和二进制 先转为二进制 再逆序排序 再转换成十进制
	 */
	public void solve6_3() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		char[] chars = sb.toString().toCharArray();
		reverse(chars);
		int ans = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			if (chars[i] == '1') {
				ans += (Math.pow(2, i));
			}
		}
		System.out.println(ans);
	}

	/**
	 * 6.1 二进制数（十进制转二进制）
	 */
	public void solve6_1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		char[] chars = sb.toString().toCharArray();
		reverse(chars);
		System.out.println(Integer.parseInt(String.valueOf(chars)));

	}

	public void reverse(char[] chars) {
		int l = 0, r = chars.length - 1;
		while (l < r) {
			char tmp = chars[l];
			chars[l] = chars[r];
			chars[r] = tmp;
			l++;
			r--;
		}
	}
}
