package org.design.decorator;

public class Decorator implements Person{

    private Person person;

    //这里的操作，需要实现类的构造方法也得传入具体的接口参数
    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        //这里的person是具体的实现，commonPerson
        person.eat();
    }
}
