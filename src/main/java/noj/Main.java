package noj;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] areas = new int[n][n]; //瓜地
		System.out.println(Arrays.deepToString(areas));
		int k = sc.nextInt(); //洒水器
		int r = sc.nextInt(); //半径

		for (int i = 0; i < k; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			areas[x][y] = 1;
			for (int j = 1; j <= r; j++) {
				if (x + j < n)
					areas[x + j][y] = 1;
				if (x - j >= 0)
					areas[x - j][y] = 1;
				if (y + j < n)
					areas[x][y + j] = 1;
				if (y - j >= 0)
					areas[x][y - j] = 1;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (areas[i][j] == 1)
					count++;
			}
		}

		System.out.println(count);

	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		System.out.println(cola(n, 0, k));
//
//	}
//
//	/**
//	 * 递归
//	 * @param n 可乐数
//	 * @param rst 空瓶子数
//	 * @param k 对换数
//	 */
//	public static int cola(int n, int rst, int k) {
//		rst += n;
//		if (rst < k)
//			return n;
//		return n + cola(rst / k, rst % k, k);
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[2]; //保存最小质数和最小合数
//		Arrays.fill(nums, -1);
//		for (int i = n + 1;; i++) {
//			if (nums[0] != -1 && nums[1] != -1)
//				break;
//			if (nums[0] == -1 && isPrime(i))
//				nums[0] = i;
//			if (nums[1] == -1 && !isPrime(i))
//				nums[1] = i;
//		}
//		System.out.println(nums[0] + nums[1]);
//	}
//
//	public static boolean isPrime(int n) {
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			if (n % i == 0)
//				return false;
//		}
//		return true;
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//
//		double ans = 0;
//		int n = 0;
//		while (ans <= k) {
//			n++;
//			ans += (double) 1 / n;
//		}
//		System.out.println(n);
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		int sum = cola(n, 0, k);
//
//
//		System.out.println(sum);
//
//	}
//
//	public static int cola(int n, int rst, int k) {
//		rst += n; // 空瓶子
//		if (rst < k)
//			return n;
//		else
//			return n + cola(rst / k, rst % k, k);
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] nums = new int[4];
//		for (int i = 0; i < 4; i++) {
//			nums[i] = sc.nextInt();
//		}
//
//		char ans = 0;
//		char[] g = new char[] {'A', 'B', 'C', 'D'};
//		double avg = (double) Arrays.stream(nums).sum() / 4;
//		int ll = 0;
//		for (int i = 0; i < 4; i++) {
//			if (nums[i] > avg)
//				ll++;
//		}
//		if (ll == 3) {
//			for (int i = 0; i < 4; i++) {
//				if (nums[i] < avg)
//					ans = g[i];
//			}
//		} else if (ll == 1) {
//			for (int i = 0; i < 4; i++) {
//				if (nums[i] > avg)
//					ans = g[i];
//			}
//		} else if (ll == 0)
//			ans = 'B';
//		else
//			ans = 'C';
//
//		System.out.println(ans);
//
//
//	}

	//error
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] nums = new int[4];
//		for(int i = 0; i < 4; i++) {
//			nums[i] = sc.nextInt();
//		}
//		char[] g = new char[] {'A', 'B', 'C', 'D'};
//
//		char ch = 0;
//		int[] rate = new int[4]; //统计出现次数
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				if (nums[i] == nums[j])
//					rate[i]++;
//			}
//		}
//		int sum = Arrays.stream(rate).sum(); //总分
//		if (sum == 10) {
//			//总分为9,三个相同
//			for (int i = 0; i < 4; i++) {
//				if (rate[i] == 1) {
//					ch = g[i];
//				}
//			}
//		} else if (sum == 16) {
//			//总分16,四个相同
//			ch = 'B';
//		} else {
//			ch = 'C';
//		}
//		System.out.println(ch);
//
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[2]; //存放最小质数和合数
//		Arrays.fill(arr, -1);
//		for (int i = n + 1;; i++) { //i从n+1开始
//			if (arr[0] == -1 && isPrime(i))
//				arr[0] = i;
//			if (arr[1] == -1 && !isPrime(i))
//				arr[1] = i;
//			if (arr[0] != -1 && arr[1] != -1)
//				break;
//		}
//		System.out.println(arr[0] + arr[1]);
//
//	}
//
//	public static boolean isPrime(int n) {
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			if (n % i == 0)
//				return false;
//		}
//		return true;
//	}


	//011
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//		int sum = 0;
//		int w = 1;
//		int d = 1;
//		int count = 0;
//		while (true) {
//			for (int i = d; i > 0; i--) {
//				count++;
//				if (count == k + 1)
//					break;
//				sum += w;
//			}
//			if (count == k + 1)
//				break;
//			d++;
//			w++;
//		}
//		System.out.println(sum);
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		char[] chars = s.toLowerCase().toCharArray();
//
//		int i = 0, j = chars.length - 1;
//		boolean flag = true;
//		while (i < j) {
//			if(chars[i] != chars[j]) {
//				System.out.println("No");
//				flag = false;
//				break;
//			}
//			i++;
//			j--;
//		}
//		if(flag)
//			System.out.println("Yes");
//
//	}

	//006
//	static final long MOD = (long) 1e9 + 7;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		long aba = 6L, abc = 6L;
//		for (int i = 2; i <= n; ++i) {
//			long newFi0 = (2 * aba + 2 * abc) % MOD;
//			long newFi1 = (2 * aba + 3 * abc) % MOD;
//			aba = newFi0;
//			abc = newFi1;
//		}
//		System.out.println((int) (aba+abc) % MOD);
//
//	}

	//003
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for(int i = 0; i<n;i++){
//			nums[i] = sc.nextInt();
//		}
//
//		//素数素组
//		List<Integer> arr = primesInSym();
//		//遍历
//		for(int i = 0; i<n; i++) {
//			if(arr.contains(nums[i]) && isSym(nums[i])) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
//		}
//
//	}
//
//	public static boolean isSym(int n) {
//		int tmp = n;
//		int num = 0;
//		while (tmp != 0) {
//			num *= 10;
//			num += tmp % 10;
//			tmp /= 10;
//		}
//		return n == num;
//	}
//
//	//对称素数数组
//	public static List<Integer> primesInSym() {
//		List<Integer> arr = new ArrayList<>();
//		boolean flag = true;
//		for(int i = 2; i< 100000; i++) {
//			for(int j = 2; j <= Math.sqrt(i); j++){
//				if(i % j == 0) {
//					flag=false;
//					break;
//				}
//			}
//			if(flag)
//				arr.add(i);
//			flag = true;
//		}
//		return arr;
//	}

	//004
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int times = sc.nextInt();
//		String[] str = new String[times];
//		for (int i = 0; i < times; i++) {
//			int n = sc.nextInt();
//			int r = sc.nextInt(); //r进制
//			str[i] = Integer.toString(n, r);
//		}
//
//		for (int i = 0; i < times; i++) {
//			System.out.println(str[i].toUpperCase());
//		}
//	}

	//002
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextInt()) {
//			int n = sc.nextInt();
//			int[] nums = new int[n];
//			for(int i = 0; i<n;i++) {
//				nums[i] = sc.nextInt();
//			}
//			int max = Integer.MIN_VALUE;
//			int min = Integer.MAX_VALUE;
//			for (int i = 0; i < n; i++) {
//				if (nums[i] > max)
//					max = nums[i];
//				if (nums[i] < min)
//					min = nums[i];
//			}
//			System.out.printf("%d %d\n", nums[n-1], nums[0]);
//		}
//	}

	//模拟1a
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//		double sn = 0.0;
//		int n = 0;
//		while (sn <= k) {
//			n++;
//			sn += (double) 1 / n;
//		}
//		System.out.println(n);
//	}
//}
}
