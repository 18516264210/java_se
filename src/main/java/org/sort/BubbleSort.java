package org.sort;

import org.BArray;

import java.util.Arrays;

/**
 * 冒泡排序算法
 * 从小到大排列
 */
public class BubbleSort extends BArray {

    public static void main(String[] args) {
        int[] ints = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < ints.length-i; j++) {
                if(ints[j] > ints[j+1]){
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }

}
