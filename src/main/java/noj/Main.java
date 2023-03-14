package noj;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int sum = 0;
		int w = 1;
		int d = 1;
		int count = 0;
		while (true) {
			for (int i = d; i > 0; i--) {
				count++;
				if (count == k + 1)
					break;
				sum += w;
			}
			if (count == k + 1)
				break;
			d++;
			w++;
		}
		System.out.println(sum);


	}

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
}
