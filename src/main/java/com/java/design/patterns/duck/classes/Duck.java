package com.java.design.patterns.duck.classes;

import com.java.design.patterns.duck.interfaces.FlyBehaviour;
import com.java.design.patterns.duck.interfaces.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
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

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}
