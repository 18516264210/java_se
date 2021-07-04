package org.design.decorator;

public class DecoratorTest {


    public static void main(String[] args) {
        //正常的多态
        Person person = new CommonPerson();
        //添加装饰器，对CommonPerson进行装饰
        Decorator decorator = new ChinesePerson(person);
        //吃东西前后要干什么，调用ChinesePerson的eat方法
        decorator.eat();
        //多次装饰
//        Decorator decorator2 = new ChineseWoman(decorator);
//        decorator2.eat();

    }
}
