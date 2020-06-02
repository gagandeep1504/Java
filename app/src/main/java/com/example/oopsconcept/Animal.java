package com.example.oopsconcept;

public class Animal {
    private int legs;
    private String color;

    public Animal(int legs, String color) {
        this.legs = legs;
        this.color = color;
    }
    public void movement (){
        System.out.println("Movement Begin");

    }
    public void getDetails(){
        System.out.println("legs: "+this.legs);
        System.out.println("color: "+this.color);
    }
}
