package com.basic_ds.day01;

import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * @author lfqtm
 */
public class MajorityElement {

    /**
     * 对抗消耗思想
     */
    public static int majorityElement(int[] arr) {
        int count = 0;
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                result = arr[i];
                count++;
            } else if (result == arr[i])
                count++;
            else
                count--;
        }

        return result;
    }

    /**
     * 排序后 多数元素处于n/2处
     */
    public static int majorityElement02(int[] arr) {
        Arrays.sort(arr); //dual pivot
        return arr[(arr.length - 1) / 2];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 3, 3, 3, 2};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement02(arr));
    }
}
