package com.example.oopsconcept;

public class Turtle extends Animal{
    public Turtle(int legs, String color) {
        super(legs, color);
    }

    @Override
    public void movement() {

        System.out.println("Walking...");
    }
}
