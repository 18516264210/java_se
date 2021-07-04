package org.design.strategy;

public class Context {

    private Animal animal;

    public Context(Animal animal){
        this.animal = animal;
    }

    public void execute() {
        animal.eat();
    }


}
