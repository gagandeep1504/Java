package com.example.oopsconcept;

public class Dog extends Animal {
    public Dog(int legs, String color) {
        super(legs, color);
    }

    @Override
    public void movement() {
        super.movement();
        System.out.println("Running...");
    }
}
