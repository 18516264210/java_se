package org.algorithm;

import java.util.Arrays;

import static java.lang.Integer.max;

/**
 * 给定一个数组arr，返回子数组的最大累加和
 * 例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
 * 题目保证没有全为负数的数据
 * [要求]
 * 时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
 */
public class Max_SubArray {

    public static void main(String[] args) {
        Max_SubArray max_subArray = new Max_SubArray();
        //如果相加是正数，就累加，如果相加是负数存储当前值
        int[] arr = {1, 2, -4, -1, 3, 6, -5, 6, 7, -6, -2};
        int i = max_subArray.maxSumOfSubArray(arr);
        System.out.println(i);
    }

    /**
     * max sum of the subarray
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxSumOfSubArray(int[] arr) {
        // 保存最大累加和
        int m = 0;
        for (int i = 1; i < arr.length; i++) {
            //当前值和当前累加值进行比较，并且将比较的较大值设为当前值。
            //如果当前值为正数，前面值为负数，那么存放的就是当前值本身
            //如果当前值是正数，前面值为正数，那么存放的就是累加值
            //如果当前值为负数，前面值为负数，那么存放的就是当前值，负数相加越加越小
            //如果当前值为负数，前面值为正数，那么存放当前值，防止越加越小
            arr[i] = max(arr[i], arr[i - 1] + arr[i]);
            m = max(m, arr[i]);
            //m按照要求基本是正数
            System.out.println(m);
        }
        System.out.println(Arrays.toString(arr));
        return m;
    }


}
