package org.sort;

import org.BArray;

import java.util.Arrays;

/**
 * 199
 * /        \
 * 280          99
 * /   \       /   \
 * 77      150   140     300
 * /   \    /
 * 150    100  50
 * <p>
 * <p>
 * 堆排序，这种思路相对更清晰一些
 */
public class HeapSort extends BArray {

    public static void main(String[] args) {
        int[] result = heapSort();
        System.out.println(Arrays.toString(result));
    }

    public static int[] heapSort() {
        // 对 arr 进行拷贝，不改变参数内容
        int[] sortArray = Arrays.copyOf(arr, arr.length);
        int len = sortArray.length;

        //构建堆对象
        for (int i = sortArray.length / 2 - 1; i >= 0; i--) {
            heapify(sortArray, i, len);
        }

        //第一个节点依次与最后一个节点做交换，重复构建堆结构
        for (int i = len - 1; i > 0; i--) {
            swap(sortArray, 0, i);
            len--;
            heapify(sortArray, 0, len);
        }
        return sortArray;
    }


    private static void heapify(int[] arr, int i, int len) {
        //1.不管当前节点是否存在子节点，都将构造两个子节点，如果不存在，则对应的长度会小于数组的长度，进行过滤
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        //2.默认找到最后一个非叶子节点
        int largest = i;
        //3.左右叶子节点分别和非叶子节点做比较，找到比当前节点大的叶子节点，并将该节点与叶子节点做交换
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        //4.largest在方法入口时等于i的值，如果两者不相同，表示中间发生过转换，需要将该节点及以下的堆做重新的比较。
        if (largest != i) {
            //当前节点和获取到的较大节点的值做交换
            swap(arr, i, largest);
            //发生交换后，需要将交换的叶子节点同下面的节点做再次递归比较
            heapify(arr, largest, len);
        }
    }
}