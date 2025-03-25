package com.java.design.patterns.duck.classes;

import com.java.design.patterns.duck.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Flying with wings!!!");
    }
}
