package org.sort;

import org.BArray;

import java.util.Arrays;

/**
 * 1.冒泡排序算法
 * 从小到大排列
 */
public class BubbleSort extends BArray {

    public static void main(String[] args) {
        int[] ints = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }

}
