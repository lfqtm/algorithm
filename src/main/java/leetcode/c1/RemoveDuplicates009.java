package leetcode.c1;

/**
 * 删除排序数组中的重复项
 */
public class RemoveDuplicates009 {

	public static void main(String[] args) {
		int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int l = 0;
		for (int r = 0; r < nums.length; r++) {
			if (nums[r] != nums[l]) {
				l++; //保留上一个
				int tmp = nums[r];
				nums[r] = nums[l];
				nums[l] = tmp;
			}
		}
		return l + 1;

	}
}
