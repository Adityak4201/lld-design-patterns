package com.java.design.patterns.duck.classes;

import com.java.design.patterns.duck.interfaces.FlyBehaviour;
import com.java.design.patterns.duck.interfaces.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehave, QuackBehaviour quackBehave) {
        flyBehaviour = flyBehave;
        quackBehaviour = quackBehave;
    }

    public abstract void display();

    public void swim() {
        System.out.println("Swimming!!!");
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
}
