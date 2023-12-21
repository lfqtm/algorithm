package backup.ky.algo.class01;

/**
 * @author lfqtm
 */
public class InsertionSort {

    /**
     * 插入排序：添加i-th元素时，保持[0～i-1]是有序的
     *
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j > -1 && arr[j] > arr[j + 1]; j--) { // 前i-1的元素
                Sorts.swap(arr, j, j+1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = Sorts.generateRandomArray(20, 100);
        Sorts.printArrays(arr);
        insertionSort(arr);
        Sorts.printArrays(arr);
    }
}
