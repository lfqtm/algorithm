package leetcode.c1;

/**
 * 1342. 将数字变成 0 的操作次数 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1
 */
public class NumberOfSteps002 {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));
	}

	/**
	 *  判断是否是偶数
	 *      是 除以2
	 *      不是 减去1
	 */
	public static int numberOfSteps(int num) {
		int count = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num -= 1;
			}
			count++;
		}

		return count;
	}
}
