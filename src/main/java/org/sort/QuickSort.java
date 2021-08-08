package org.sort;

import org.BArray;

import java.util.Arrays;

/**
 * 快速排序算法
 * 找到某个基准值，然后分两个指针，两个指针分别从数组的前后向中间移动，
 * 左边指针遇到比基准值大的停，右边指针遇到比基准值小的停，交换两个指针对应的数据，直到两个指针相遇。
 * <p>
 * 然后将基准值与相遇时候指针对应的值进行交换。
 * <p>
 * 然后将数组分为两段不断快速排序。
 */
public class QuickSort extends BArray {

    public static void main(String[] args) {
        int[] sourceArray = Arrays.copyOf(arr, arr.length);
        //int[] sortArray = quickSort(sourceArray, 0, sourceArray.length - 1);
        //System.out.println(Arrays.toString(sortArray));
        quickSort2(sourceArray, 0, sourceArray.length - 1);
        System.out.println(Arrays.toString(sourceArray));
    }

    public static int[] quickSort(int arr[], int start, int end) {
        //初始基准值，默认使用第一个元素
        int pivot = arr[start];
        //左边指针
        int i = start;
        //右边指针
        int j = end;
        while (i < j) {
            //右边指针先移动，如果大于基准值，继续向左移动
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                swap(arr, i, j);
            }
        }
        if (i - 1 > start) {
            arr = quickSort(arr, start, i - 1);
        }
        if (j + 1 < end) {
            arr = quickSort(arr, j + 1, end);
        }
        return arr;
    }

    /**
     * 这里的left right是相对的，因为快排后面需要分割
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort2(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int pivot = arr[left];

        //这里执行完毕后，相当于完成了依次基准值左右两边的交换，但是基准值和最后的中间值未做交换
        while (i < j) {
            //先从右向左，遇到比基准数小的停，遇到比基准数大的继续向左
            while (i < j && pivot <= arr[j]) {
                j--;
            }
            //再从左向右，遇到比基准数大的停，遇到比基准数小的继续向右
            while (i < j && pivot >= arr[i]) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                swap(arr, i, j);
            }
        }
        //最后将基准为与i和j相等位置的数字交换
        arr[left] = arr[i];
        arr[i] = pivot;
        //递归调用左半数组
        quickSort2(arr, left, j - 1);
        //递归调用右半数组
        quickSort2(arr, j + 1, right);

    }
}
