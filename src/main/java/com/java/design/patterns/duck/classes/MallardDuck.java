package com.java.design.patterns.duck.classes;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.err.println("Mallard duck!!");
    }
}
