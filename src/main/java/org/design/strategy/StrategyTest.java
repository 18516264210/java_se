package org.design.strategy;

public class StrategyTest {


    public static void main(String[] args) {
        Animal animal = new Dog();
        Context context = new Context(animal);
        context.execute();
    }



}
