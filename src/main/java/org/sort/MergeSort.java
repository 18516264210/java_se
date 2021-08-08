package org.sort;


import org.BArray;

import java.util.Arrays;

/**
 * 归并排序算法
 */
public class MergeSort extends BArray {

    public static void main(String[] args) {
        //int[] sortArray = Arrays.copyOf(arr, arr.length);
        int[] sortArray = {22, 34, 3, 32};
        sort(sortArray, 0, sortArray.length - 1);
        System.out.println(Arrays.toString(sortArray));
    }

    //22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70
    private static void sort(int[] sortArray, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(sortArray, low, mid);
        sort(sortArray, mid + 1, high);
        merge(sortArray, low, mid, high);
    }

    private static void merge(int[] sortArray, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        //开始合并
        while (i <= mid && j <= high) {
            temp[k++] = sortArray[i] <= sortArray[j] ? sortArray[i++] : sortArray[j++];
        }
        while (i <= mid) {
            temp[k++] = sortArray[i++];
        }
        while (j <= high) {
            temp[k++] = sortArray[j++];
        }
        for (int m = 0; m < temp.length; m++) {
            sortArray[m + low] = temp[m];
        }
    }
}
