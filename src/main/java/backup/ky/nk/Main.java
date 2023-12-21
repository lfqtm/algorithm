package backup.ky.nk;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int pow = n * n;
			String ns = String.valueOf(n);
			String pows = String.valueOf(pow);

			int sum = 0;
			int powsum = 0;
			for (int i = 0; i < ns.length(); i++) {
				sum += Character.getNumericValue(ns.charAt(i));
			}
			for (int i = 0; i < pows.length(); i++) {
				powsum += Character.getNumericValue(pows.charAt(i));
			}
			System.out.println(sum + " " + powsum);

		}
	}
}
