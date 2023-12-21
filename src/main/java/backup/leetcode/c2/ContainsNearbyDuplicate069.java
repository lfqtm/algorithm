package backup.leetcode.c2;

import backup.leetcode.utils.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. 存在重复元素 II
 */
public class ContainsNearbyDuplicate069 {

	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(Array.build("1,2,3,1,2,3"), 2));
	}

	//暴力解
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		int n = nums.length;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (nums[i] == nums[j] && j - i <= k)
//					return true;
//			}
//		}
//		return false;
//	}

	//hashmap
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = nums[i];
			if (map.containsKey(num) && i - map.get(num) <= k)
				return true;
			map.put(num, i);
		}
		return false;
	}
}
