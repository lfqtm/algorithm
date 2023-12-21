package backup.ky.basic_ds.day02;

import backup.ky.algo.class01.Sorts;

/**
 * @author lfqtm
 */
public class SortColors {

//    public static void sortColors(int[] arr) {
//        //双指针
//        int p1 = 0;
//        int p2 = arr.length - 1;
//
//        for (int i = 0; i <= p2; i++) {
//            if (arr[i] == 0) {
//                Sorts.swap(arr, i ,p1);
//                p1++;
//            }
//            while (i < p2 && arr[i] == 2) { //直到i-th位置的元素交换后不为2为止
//                Sorts.swap(arr, i, p2);
//                p2--;
//            }
//        }
//
//    }

    public static void sortColors(int[] arr) {
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            //0往前放
            if (arr[i] == 0)
                Sorts.swap(arr, i, p++);
        }

        for (int i = 0; i < arr.length; i++) {
            //1往前放
            if (arr[i] == 1)
                Sorts.swap(arr, i, p++);

        }
    }

    public static void main(String[] args) {
        //[2,0,2,1,1,0]
        int[] arr = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(arr);
        Sorts.printArrays(arr);
    }
}
