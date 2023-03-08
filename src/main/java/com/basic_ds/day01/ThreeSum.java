package com.basic_ds.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和：排序+双指针
 *
 * @author lfqtm
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        // 排序  [-4,-1,-1,0,1,2]
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 || arr.length < 3) // 不可能等于0了
                return result;
            if (i > 0 && arr[i-1] == arr[i]) continue; // 去重
            //左右指针
            int left = i+1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left < right && arr[right] == arr[right-1]) right--; //跳过重复元素
                    right--;
                    while (left < right && arr[left] == arr[left+1]) left++;
                    left++;
                } else if (sum > 0) { // 尝试右指针指向较小元素
                    right--;
                } else {
                    left++;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(arr);
        lists.forEach((l)-> System.out.println(Arrays.toString(l.toArray())));

    }
}
