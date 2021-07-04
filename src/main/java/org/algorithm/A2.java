package org.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A2 {

    /**
     * 这样做的问题就是无法判定到底定义多长的数组，因为根本不知道数组内的最大值为多少
     */
    @Test
    public void t(){
        //int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] arr = {100,100};
        sortByBits(arr);
    }

    public int[] sortByBits(int[] arr) {
        int[] bit = new int[10001];
        List<Integer> list = new ArrayList<Integer>();
        //将原数组的值存放在list集合中
        //将对应的二进制1的个数存放在数组中，并且下标为元素的值
        for (int x : arr) {
            list.add(x);
            bit[x] = get(x);
        }
        //遍历原集合元素
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                //如果二进制位1的个数不相同，按照二进制位1的个数多少排列
                if (bit[x] != bit[y]) {
                    return bit[x] - bit[y];
                } else {
                    //如果二进制位1的个数相同，按照原数组的值得大小排列
                    return x - y;
                }
            }
        });
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        for (int i : arr) {
            System.out.println(i);
        }
        return arr;
    }

    /**
     * 获取二进制1个数
     * @param x
     * @return
     */
    public int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 2;
            x /= 2;
        }
        return res;
    }
}
