package org.algorithm;

import java.util.*;

/**
 * 求两个数组元素的交集
 */
public class Array_Mixed {

    public static void main1(String[] args) {
        String[] a = {"aaa>>0", "aaa>>1", "aaa>>2", "aaa>>3", "aaa>>4", "aaa>>5", "aaa>>6", "aaa>>7", "aaa>>8", "aaa>>9"};
        String[] b = {"aaa>>10", "aaa>>9", "aaa>>8", "aaa>>7", "aaa>>6", "aaa>>5", "aaa>>4", "aaa>>3", "aaa>>2", "aaa>>1"};

        Map<String, Integer> kmap = new HashMap<String, Integer>();
        for (int i = 0; i < a.length; i++) {
            kmap.put(a[i], kmap.getOrDefault(a[i], 0) + 1);
        }
        for (int i = 0; i < b.length; i++) {
            kmap.put(b[i], kmap.getOrDefault(b[i], 0) + 1);
        }
        List<String> mix = new ArrayList<>();
        for (String key : kmap.keySet()) {
            if(kmap.get(key)>1){
                mix.add(key);
            }
        }
        System.out.println(mix);
    }


    public static void main(String[] args) {
        String[] a = {"aaa>>0", "aaa>>1", "aaa>>2", "aaa>>3", "aaa>>4", "aaa>>5", "aaa>>6", "aaa>>7", "aaa>>8", "aaa>>9"};
        String[] b = {"aaa>>10", "aaa>>9", "aaa>>8", "aaa>>7", "aaa>>6", "aaa>>5", "aaa>>4", "aaa>>3", "aaa>>2", "aaa>>1"};
        //可以将已经加入的数据删除，防止重复比较
        Set<String> set = new HashSet<>();
        for (String ai : a) {
            for (String bi : b) {
                if(ai==bi){
                    set.add(ai);
                }
            }
        }
        System.out.println(set);
    }
}
