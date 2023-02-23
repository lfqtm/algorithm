package com.carl.two_pointers;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {
		//[0,1,2,2,3,0,4,2]
		//删除2
		int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
		int i = removeElement(nums, 2);
		System.out.println(i);
	}

	public static int removeElement(int[] nums, int val) {
		//快慢指针
		int slow = 0;
		for (int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != val) {
				//fast不是val时，交换fast和slow
				nums[slow] = nums[fast];
				slow++;
			}
		}
		nums = Arrays.copyOfRange(nums, 0, slow);
		System.out.println(Arrays.toString(nums));
		return slow;
	}
}
