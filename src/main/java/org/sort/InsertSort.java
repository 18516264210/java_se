package org.sort;

import org.BArray;

import java.util.Arrays;

/**
 * 插入排序算法
 * <p>
 * 拿出一个元素，与前面的元素分别比较。
 * 正常比较时，前面的元素是已经排好序的，所以只要找到第一个符合条件的就可以交换数据
 */
public class InsertSort extends BArray {

    public static void main(String[] args) {
        int[] ints = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < ints.length; i++) {
            //要插入的元素，需要与其之前的数据进行比较
            int todo = ints[i];
            int j = i;
            //j-1表示需要插入的节点的前一个元素，如果小于该值，继续向前判断
            while (j > 0 && todo < ints[j - 1]) {
                //将比要插入元素大的元素向后移一位
                ints[j] = ints[j - 1];
                j--;
            }
            //将要插入的元素插入到j位置
            ints[j] = todo;
        }
        System.out.println(Arrays.toString(ints));
    }

}
