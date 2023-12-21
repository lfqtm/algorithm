package backup.leetcode.c1;

/**
 * 215. 数组中的第K个最大元素
 *
 * 快排，对元素进行排序
 */
public class FindKthLargest_heap012 {

	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 1, 5, 6, 4};
		System.out.println(findKthLargest(nums, 2));
	}

	public static int findKthLargest(int[] nums, int k) {
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			for (j = i - 1; j >= 0 && nums[j] > temp; j--) {
				nums[j + 1] = nums[j];
			}
			nums[j + 1] = temp;
		}
		return nums[nums.length - k];
	}
}
