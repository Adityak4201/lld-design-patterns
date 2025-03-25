package com.java.design.patterns.duck.classes;

import com.java.design.patterns.duck.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.err.println("squeak!!!");

    }
}
