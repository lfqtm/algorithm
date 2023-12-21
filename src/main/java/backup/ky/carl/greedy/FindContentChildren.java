package backup.ky.carl.greedy;

import java.util.Arrays;

/**
 * 455. 分发饼干
 * 思想：
 *      贪心 大饼干尽量喂饱大胃口
 */
public class FindContentChildren {
	public static void main(String[] args) {
		int[] g = new int[] {1, 2}; //胃口
		int[] s = new int[] {1, 2, 3}; //饼干
		System.out.println(findContentChildren(g, s));
	}

	public static int findContentChildren(int[] g, int[] s) {
		// 将两个数组先排好序
		Arrays.sort(g);
		Arrays.sort(s);

		// 遍历胃口 找到合适的饼干填补
		int si = s.length - 1;
		int count = 0;
		for (int i = g.length - 1; i > -1 ; i--) {
			if (s[si] >= g[i] && si >= 0) {
				System.out.println(s[si] + "满足" + g[i]);
				count++;
				si--;
			}

		}
		return count;
	}
}
