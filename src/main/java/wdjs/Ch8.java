package wdjs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ch8 {

	/**
	 * 8.4 打印杨辉三角前n行
	 */
	public void solve8_4() {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < rows; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
			}
			ans.add(row);
		}
		ans.forEach(System.out::println);

	}

	/**
	 * 8.3斐波那契
	 */
	public void solve8_3() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}

	private long fib(int n) {
		if (n == 0 || n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	/**
	 * 8.2 n的阶乘
	 */
	public void solve8_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
	}

	private long factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
