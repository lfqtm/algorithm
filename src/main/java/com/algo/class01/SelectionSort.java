package com.algo.class01;

import static com.algo.class01.Sorts.generateRandomArray;
import static com.algo.class01.Sorts.printArrays;

/**
 * @author lfqtm
 */
public class SelectionSort {

    /**
     * 简单选择排序：找最小值（遍历+比较）+交换 o(n^2)
     * @param a
     */
    public static void selectionSort(int[] a) {
        if (a == null || a.length < 2)
            return;
        for (int i = 0; i < a.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < a.length; j++)
                min_index = a[j] < a[min_index] ? j : min_index;
            swap(a, i, min_index);
        }
    }

    // 交换
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(10, 20);
        printArrays(arr);
        selectionSort(arr);
        printArrays(arr);

    }
}
