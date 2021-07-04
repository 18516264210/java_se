package org.base;

import org.junit.Test;

public class Const {

    private String name;
    private static String big = "big";

    {
        name = "zhangsan";
    }

    private String tool = "lisi";

    {
        name = "wangwu";
        tool = "yingwen";
    }

    static {
        big = "wang";
    }

    public Const() {
        big = "liwu";
    }

    @Test
    public void main() {
        System.out.println(name);
        System.out.println(tool);
        System.out.println(big);
    }



}
