package heima.ch1;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     * 基础版二分查找
     *
     * @param a      有序数组
     * @param target target
     * @return 下标
     */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length - 1; // 初始化指针初值
        while (i <= j) { // [i,j]范围内查找
            int m = (i + j) / 2; // 设置中间值下标
            if (a[m] > target) { // 目标值在中间值的左边
                j = m - 1; // 设置j指针
            } else if (a[m] < target) { // 目标值在中间值的右边
                i = m + 1; // 设置i指针
            } else {
                return m; // 找到
            }
        }
        return -1;
    }

    /**
     * 基础版修改除法越界
     * 无符号右移 >>>
     */
    public static int binarySearchBasicPlus(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;  // 除以2且向下取整
            if (a[m] < target) {
                i = m + 1;
            } else if (target < a[m]) {
                j = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 基础版修改查找范围
     */
    public static int binarySearchAlternative(int[] a, int target) {
        int i = 0, j = a.length;
        while (i < j) { // [i,j)范围内查找
            int m = (i + j) >>> 1;
            if (a[m] < target) { // 在左边
                i = m + 1;
            } else if (target < a[m]) { // 在右边
                j = m;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 查找时间平衡版
     */
    public static int binarySearchLoopBalance(int[] a, int target) {
        int i = 0, j = a.length;
        while (1 < j - i) { //[i,j)
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m;
            } else {
                i = m;  // 不能是m+1,假如m就是目标值,就会被跳过
            }
        }

        if (a[i] == target) {
            return i; // i表示目标值的下标
        } else {
            return -1;
        }
    }

    /**
     * leftmost,查找重复元素最左下标
     */
    public static int binarySearchLeftMost(int[] a, int target) {
        int i = 0, j = a.length - 1;
        int candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (a[m] < target) {
                i = m + 1;
            } else if (target < a[m]) {
                j = m - 1;
            } else {
                // 记录候选位置
                candidate = m;
                // 需要找最左侧,需要缩小j的范围
                // 如果查找最右侧,缩小i的范围
                j = m - 1;
            }
        }
        return candidate;
    }

    /**
     * rightmost,查找重复元素最右下标
     */
    public static int binarySearchRightMost(int a[], int target) {
        int i = 0, j = a.length - 1;
        int candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (a[m] < target) {
                i = m + 1;
            } else if (a[m] > target) {
                j = m - 1;
            } else {
                candidate = m;
                i = m + 1;
            }
        }
        return candidate;
    }

    /**
     * leftmost2,查找重复元素最左下标,返回i的版本
     *
     * @return i
     * 找到: 返回target的最左索引
     * 没找到: 返回比目标大的最左索引
     *
     * i:  小于等于目标值的最靠左的索引位置
     */
    public static int binarySearchLeftMost2(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target <= a[m]) {  // target <= a[m]
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;
    }

    /**
     * rightmost,查找重复元素最右下标,返回i的版本
     * i - 1: 大于等于 目标值的最靠右的索引位置
     */
    public static int binarySearchRightMost2(int a[], int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else {  // target >= a[m]
                i = m + 1;
            }
        }
        return i - 1;
    }
}
