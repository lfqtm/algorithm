package backup.leetcode.c1;

/**
 * 69. x 的平方根
 */
public class MySqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(8));
	}

	public static int mySqrt(int x) {
		//二分求mid*mid<=x
		int l = 0, r = x, ans = -1;
		int mid = 0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if ((long) mid * mid <= x) {
				ans = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}
}
