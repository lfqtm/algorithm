package com.basic_ds.day01;

/**
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 *
 * 思路：异或 a^a=0 a^a^b=b
 *
 * @author lfqtm
 */
public class SingleNumber {
    public static int singleNumber(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[0] ^= arr[i+1];
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-1, 2, 2, 3, -1}; //expect 3
        System.out.println(singleNumber(arr));
    }
}
