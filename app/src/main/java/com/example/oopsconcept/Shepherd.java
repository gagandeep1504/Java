package com.example.oopsconcept;

public class Shepherd extends Dog {

    public Shepherd(int legs, String color ){
        super(legs, color);
    }

    @Override
    public void movement() {
        super.movement();
        System.out.println("Running...");
    }
}
