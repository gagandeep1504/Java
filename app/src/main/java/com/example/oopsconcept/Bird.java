package com.example.oopsconcept;

public class Bird extends Animal {
    public Bird(int legs, String color) {
        super(legs, color);
    }

    @Override
    public void movement() {
        super.movement();
        System.out.println("Flying.....");
    }
}
