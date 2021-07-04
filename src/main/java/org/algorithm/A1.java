package org.algorithm;


import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
 * 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。
 * 请你返回排序后的数组。
 */
public class A1 {


    /**
     * 这样做的缺陷是无法存放重复的数据，重复的数据会在map中被覆盖掉
     */
    @Test
    public void sortBinary(){
        //int[] arr = {0,1,2,3,4,5,6,7,8};
        //int[] arr = {512,1024,256,128,64,32,16,8,4,2,1};
        int[] arr = {1000,1000};
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int count = hammingWeight(arr[i]);
            map.put(arr[i],count);
        }
        List<Map.Entry<Integer, Integer>> list_temp = map
                .entrySet()
                .stream()
                .sorted((p1, p2) -> p1.getValue().compareTo(p2.getValue()))
                .collect(Collectors.toList());
        System.out.println(list_temp);

        List<Map.Entry<Integer, Integer>> list = list_temp.stream().sorted((p1,p2) -> {
            int compare1 = p1.getValue() - p2.getValue();
            int compare2 = p1.getKey() - p2.getKey();
            if(compare1 == 0){
                return compare2;
            }
            return 0;
        }).collect(Collectors.toList());
        System.out.println(list);

        int[] res = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i).getKey();
        }
        System.out.println(Arrays.toString(res));
    }


    /**
     * 求解二进制1的个数
     * @param n
     * @return
     */
    private int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int j = n >>> i;
            int f = j & 1;
            if (f == 1) {
                count++;
            }
        }
        return count;
    }

}
