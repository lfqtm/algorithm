package com.leetcode.basic_ds.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 *
 * @author lfqtm
 */
public class RangeMerge {

//    public static int[][] merge(int[][] intervals) {
//        int p = 0;
//        int[][] result = new int[intervals.length][intervals[0].length];
//        //双指针
//        int left = 0, right = 0;
//        for (int i = 0; i < intervals.length; i++) {
//            if (i == 0) {
//                left = intervals[0][0];
//                right = intervals[0][1];
//            } else {
//                if (intervals[i][0] <= right) {
//                    right = intervals[i][1];
//                }
//                if (intervals[i][0] > right) {
//                    result[p][0] = left;
//                    result[p][1] = right;
//                    p++;
//                    //重新初始化
//                    left = intervals[i][0];
//                    right = intervals[i][1];
//                }
//            }
//        }
//        if (left != 0 && right != 0) {
//            result[p][0] = left;
//            result[p][1] = right;
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
//        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return 0;
//            }
//        });
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0])); // 区间递增排序
        int left = -1, right = -1;
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0) {
                left = intervals[i][0];
                right = intervals[i][1];
            }
            if (right > intervals[i][0]) {
                right = intervals[i][1];
            } else {
                result.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        result.add(new int[] {left, right});
        return result.toArray(new int[result.size()][]);
    }
}
