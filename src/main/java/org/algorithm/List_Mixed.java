package org.algorithm;


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * 求两个集合的交集
 */
public class List_Mixed {


    public static void main(String[] args) {
        List<String> strList1 = new ArrayList<String>();
        List<String> strList2 = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            strList1.add("aaa>>" + i);
            strList2.add("aaa>>" + (10 - i));
        }
        System.out.println(JSON.toJSON(strList1));
        System.out.println(JSON.toJSON(strList2));

        //求出交集
        strList2.retainAll(strList1);
        System.out.println("交集大小：" + strList2.size());

        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i));
        }
    }

}
