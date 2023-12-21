package backup.ky.nk;

import java.util.Scanner;

/**
 * ky18 特殊乘法
 */
public class Ky18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.next();
			String b = sc.next();
			char[] as = a.toCharArray();
			char[] bs = b.toCharArray();
			int sum = 0;
			for (char a1 : as) {
				for (char b1 : bs) {
					sum += Character.getNumericValue(a1) * Character.getNumericValue(b1);
				}
			}

			System.out.println(sum);
		}
	}

}
