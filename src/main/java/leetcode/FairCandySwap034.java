package leetcode;

import leetcode.utils.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 888. 公平的糖果交换
 */
public class FairCandySwap034 {

	public static void main(String[] args) {

		int[] aliceSizes = Array.build("1,1");
		int[] bobSizes = Array.build("2,2");

		int[] ans = fairCandySwap(aliceSizes, bobSizes);
		System.out.println(Arrays.toString(ans));

	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		// 设x，y分别是爱丽丝和鲍勃的交换糖果数
		// 有sum1-x+y=sum2+x-y
		// 变换表达有x=y+（sum1-sum2）/2
		int suma = Arrays.stream(aliceSizes).sum();
		int sumb = Arrays.stream(bobSizes).sum();
		//将alice的数据存放在hash表中
		Set<Integer> hash = new HashSet<>();
		for (int aliceSize : aliceSizes) {
			hash.add(aliceSize);
		}

		int[] ans = new int[2];
		int alpha = (suma - sumb) / 2;
		for (int y : bobSizes) {
			int x = y + alpha;
			if (hash.contains(x)) {
				ans[0] = x;
				ans[1] = y;
				break;
			}
		}
		return ans;

	}
}
