package backup.ky.algo.class01;

/**
 * @author lfqtm
 */
public class BubbleSort {

    /**
     * 冒泡排序：两个数较大的交换到后面
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        //两次循环遍历
        for (int i = arr.length - 1; i > 0; i--) {
            //i从后往前递减（冒大数，最先确定的是下标n-1）
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j])
                    Sorts.swap(arr, i ,j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = Sorts.generateRandomArray(20, 100);
        Sorts.printArrays(arr);
        bubbleSort(arr);
        Sorts.printArrays(arr);
    }

}
