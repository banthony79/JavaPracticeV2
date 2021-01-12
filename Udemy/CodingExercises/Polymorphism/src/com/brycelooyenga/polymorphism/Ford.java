package com.brycelooyenga.polymorphism;

public class Ford extends Car {


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startingEngine()";
    }
    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }
    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}
