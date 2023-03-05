package leetcode.c1;

import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 *
 * 快排，对元素进行排序
 */
public class FindKthLargest012 {

	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 1, 5, 6, 4};
		System.out.println(findKthLargest(nums, 2));
	}

	public static int findKthLargest(int[] nums, int k) {
		quickSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
		return nums[nums.length - k];
	}

	/**
	 * 快速排序
	 */
//	public static void quickSort(int[] arrays, int left, int right) {
//		if (left > right) {
//			return;
//		}
//		int l = left;
//		int r = right;
//		int pivot = arrays[left]; //去一个枢轴元素
//		int temp = 0;
//		while (l < r) {
//			while (pivot <= arrays[r] && l < r) { //找大于pivot的元素
//				r--;
//			}
//			while (pivot >= arrays[l] && l < r) { //找小于pivot的元素
//				l++;
//			}
//			if (l <= r) {
//				//交换这两个元素
//				temp = arrays[r];
//				arrays[r] = arrays[l];
//				arrays[l] = temp;
//			}
//		}
//		arrays[left] = arrays[l]; //交换pivot元素，确定他的最终位置
//		arrays[l] = pivot; //换一个枢轴元素
//		quickSort(arrays, left, l - 1);
//		quickSort(arrays, l + 1, right);
//	}

	//快排

	public static void quickSort(int[] arrays, int left, int right) {
		if (left > right)
			return;

		int l = left;
		int r = right;
		int pivot = arrays[left];
		int temp = 0;
		while (l < r) {
			while (pivot <= arrays[r] && l < r)
				r--;
			while (pivot >= arrays[l] && l < r) {
				l++;
			}

			if (l <= r) {
				temp = arrays[l];
				arrays[l] = arrays[r];
				arrays[r] = temp;
			}
		}

		arrays[left] = arrays[l];
		arrays[l] = pivot;
		quickSort(arrays, left, l - 1);
		quickSort(arrays, l + 1, right);
	}
}
