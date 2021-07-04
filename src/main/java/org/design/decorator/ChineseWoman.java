package org.design.decorator;

public class ChineseWoman extends ChinesePerson{

    public ChineseWoman(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        super.eat();
        decoratorMehtodAfter();
    }

    private void decoratorMehtodAfter() {
        System.out.println("============this is decorator method【chat】============");
    }

}
