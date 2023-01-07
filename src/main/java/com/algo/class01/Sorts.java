package com.algo.class01;

import java.util.Arrays;

/**
 * @author lfqtm
 */
public final class Sorts {

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random() - (maxValue) * Math.random());
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
//        arr[i] = arr[i] ^ arr[j]; // i和j指向不同的地址，相同的地址异或等于0
//        arr[j] = arr[i] ^ arr[j];
//        arr[i] = arr[i] ^ arr[j];
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void printArrays(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
