package com.java.design.patterns.duck.classes;

import com.java.design.patterns.duck.interfaces.FlyBehaviour;

public class FlyNot implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("flight denied to the user");
    }
}
