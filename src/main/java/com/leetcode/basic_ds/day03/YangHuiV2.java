package com.leetcode.basic_ds.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角2
 * @author lfqtm
 */
public class YangHuiV2 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0)
            return list;
        while (rowIndex-- >= 0) {
            list.add(1); //保持rowIndex长度的list
            for (int i = list.size() - 2; i > 0; i--) {
                //从倒数第二个元素开始
                list.set(i, list.get(i) + list.get(i-1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRow(3).toArray()));
    }
}
