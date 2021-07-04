package org.design.decorator;

/**
 * 具体实现，正常的多态形式
 */
public class CommonPerson implements Person{

    @Override
    public void eat() {
        System.out.println("吃东西");
    }
}
