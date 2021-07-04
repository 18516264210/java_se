package org.design.decorator;

public class ChinesePerson extends Decorator{

    public ChinesePerson(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        decoratorMethodBefore();
        super.eat();
        decoratorMethodAfter();
    }


    private void decoratorMethodBefore(){
        System.out.println("============this is decorator method【wash hands】============");
    }

    private void decoratorMethodAfter(){
        System.out.println("============this is decorator method【smoking】============");
    }
}
