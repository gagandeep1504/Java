package com.example.oopsconcept;

public class Haskey extends Dog {
    public Haskey( int legs, String color) {
        super(legs, color);
    }

    @Override
    public void movement() {
        super.movement();
        System.out.println("Running...");
    }
}
