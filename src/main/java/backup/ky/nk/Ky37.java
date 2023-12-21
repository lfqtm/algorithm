package backup.ky.nk;

import java.util.*;

/**
 * KY37 小白鼠排队
 */
public class Ky37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] weight = new int[n];
		String[] hat = new String[n];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			hat[i] = sc.next();
		}

		//对weight生成二维数组
		int[][] nums = new int[n][2];
		for (int i = 0; i < n; i++) {
			nums[i][0] = weight[i];
			nums[i][1] = i;
		}
		//对nums按第一行倒序排序
		System.out.println(Arrays.deepToString(nums));
		Arrays.sort(nums, (a, b) -> b[0] - a[0]);
		System.out.println(Arrays.deepToString(nums));

		for (int i = 0; i < n; i++) {
			System.out.println(hat[nums[i][1]]);
		}

	}

	private static void test() {
		int[][] nums = new int[][]{{30, 50, 40}, {0, 1, 2}};
		System.out.println(Arrays.deepToString(nums));
		Arrays.sort(nums, (a, b) -> a[0] - b[0]);
		System.out.println(Arrays.deepToString(nums));
	}


}
