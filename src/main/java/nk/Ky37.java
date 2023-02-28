package nk;

import java.util.*;

/**
 * KY37 小白鼠排队
 */
public class Ky37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<Integer, String> infs = new HashMap<>(n);
		for (int i = 0; i < n; i++) {
			infs.put(sc.nextInt(), sc.next());
		}

		infs.keySet().stream()
			.sorted(Comparator.reverseOrder())
			.forEach(k -> {
				System.out.println(infs.get(k));
			});

	}

}
