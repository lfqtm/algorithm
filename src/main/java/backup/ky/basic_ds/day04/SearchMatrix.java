package backup.ky.basic_ds.day04;

/**
 * 特殊矩阵搜索
 * 矩阵特性
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 * @author lfqtm
 */
public class SearchMatrix {

    private static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (binarySearchLine(matrix[i], target) > 0) {
                return true;
            }
        }
        return false;
    }

    private static int binarySearchLine(int[] line, int target) {
        int m, num;
        int low = 0, high = line.length - 1;
        while (low <= high) {
            m = (high - low) / 2 + low;
            num = line[m];
            if (num > target)
                low = m + 1;
            if (num < target)
                high = m - 1;
            if (num == target)
                return m;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 4, 7, 11}, {2, 5, 8, 12}, {3, 6, 9, 16}, {10, 13, 14, 17}};
        System.out.println(searchMatrix(matrix, 5));
    }
}
