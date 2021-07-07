package org.sort;

import org.BArray;

import java.util.Arrays;

/**
 * 选择排序算法
 * 按照从小到大排序
 * <p>
 * 选择排序算法的要点是选择最小或者最大的数的下标，然后进行交换
 */
public class SelectSort extends BArray {

    public static void main(String[] args) {
        int[] ints = Arrays.copyOf(arr, arr.length);
        //从第一个元素开始
        for (int i = 0; i < ints.length - 1; i++) {
            //找到最小值的下标
            int min = i;
            //与当前值进行比较
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[min] > ints[j]) {
                    min = j;
                }
            }
            //交换数据
            if (min != i) {
                swap(ints, min, i);
            }
        }
        System.out.println(Arrays.toString(ints));
    }

}
