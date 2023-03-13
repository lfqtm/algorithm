package noj;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		String[] str = new String[times];
		for (int i = 0; i < times; i++) {
			int n = sc.nextInt();
			int r = sc.nextInt(); //r进制
			str[i] = Integer.toString(n, r);
		}

		for (int i = 0; i < times; i++) {
			System.out.println(str[i].toUpperCase());
		}


	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//
//		List<Integer> primes = primes();
//		for (int i = 0; i < n; i++) {
//			if (primes.contains(nums[i]) && isSym(nums[i]))
//				System.out.println("Yes");
//			else
//				System.out.println("No");
//		}
//
//
//	}
//
//	public static boolean isSym(int n) {
//		//逆置整数
//		int num = n;
//		int ans = 0;
//		while (num != 0) {
//			ans *= 10;
//			ans += num % 10;
//			num /= 10;
//		}
//		return ans == n;
//
//	}
//
//	private static List<Integer> primes() {
//		boolean flag = true;
//		List<Integer> arr = new ArrayList<>();
//		for (int i = 2; i < 100000; i++) {
//			for (int j = 2; j < Math.sqrt(i); j++) {
//				if (i % j == 0) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag)
//				arr.add(i);
//			flag = true;
//		}
//		return arr;
//	}

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
}
