package com.java.design.patterns.duck;

import com.java.design.patterns.duck.classes.Duck;
import com.java.design.patterns.duck.classes.MallardDuck;

/**
 * JavaFX App
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}