package backup.leetcode.c2;

import backup.leetcode.utils.Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges070 {

	public static void main(String[] args) {
		System.out.println(summaryRanges(Array.build("0,1,2,4,5,7")));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> ans = new ArrayList<>();
		int n = nums.length;
		int i = 0;
		while (i < n) {
			int low = i;
			i++;
			while (i < n && nums[i] == nums[i - 1] + 1)
				i++;

			int high = i - 1;
			StringBuilder buffer = new StringBuilder(Integer.toString(nums[low]));
			if (low < high) {
				//差值大于1
				buffer.append("->");
				buffer.append(nums[high]);
			}
			ans.add(buffer.toString());
		}
		return ans;

	}
}
