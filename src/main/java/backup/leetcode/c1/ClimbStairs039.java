package backup.leetcode.c1;

/**
 * 70. 爬楼梯
 */
public class ClimbStairs039 {

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

	/**
	 * 动态规划优化解：滚动数组
	 */
	public static int climbStairs(int n) {
		int a = 0, b = 0, r = 1;
		for (int i = 0; i < n; i++) {
			a = b;
			b = r;
			r = a + b;
		}
		return r;
	}
}
