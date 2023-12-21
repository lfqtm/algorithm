package heima.ch2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * 数据结构-动态数组
 */
public class DynamicArray implements Iterable<Integer> {
    private int size = 0; // 逻辑大小
    private int capacity = 8; // 容量
    private int[] array = {}; // 初始数组

    public void addLast(int elem) {
        add(size, elem);
    }

    /**
     * add
     *
     * @param index 插入位置
     * @param elem  插入元素
     */
    public void add(int index, int elem) {
        checkAndGrow();
        if (index >= 0 && index < size) {
            // index后elem都后移一位
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = elem;
        size++;
    }

    /**
     * 容量检查并扩容
     */
    private void checkAndGrow() {
        // 容量检查
        if (size == 0) {
            // 惰性扩容
            array = new int[capacity];
        } else if (size == capacity) {
            // 进行扩容 1.5倍
            capacity += capacity >>> 1;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public int get(int index) {
        return array[index];
    }

    /**
     * 函数式接口遍历
     *
     * @param consumer
     */
    public void foreach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
//            System.out.println(array[i]);
            consumer.accept(array[i]);
        }
    }

    /**
     * 迭代器遍历
     *
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;

            @Override
            public boolean hasNext() {  // 有下一个元素
                return i < size;
            }

            @Override
            public Integer next() {  // 返回当前元素,并移动到下一个元素
                return array[i++];
            }
        };
    }

    /**
     * 流式遍历
     *
     * @return
     */
    public IntStream stream() {
        return IntStream.of(Arrays.copyOfRange(array, 0, size));
    }

    /**
     * 删除元素,index后面的数据向前移动一个
     *
     * @param index
     * @return
     */
    public int remove(int index) {
        int removed = array[index];
        if (index < size - 1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            size--;
        }
        return removed;
    }

}
