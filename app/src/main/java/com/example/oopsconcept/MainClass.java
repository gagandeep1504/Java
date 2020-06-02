package com.example.oopsconcept;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Bird\n2. Turtle\n3. Shepherd\n4. Haskey");
        System.out.println("Please Enter A Number: ");
        int choice = scanner.nextInt();
        Bird bird = new Bird(2, "Golden");
        Turtle turtle = new Turtle(4,"Green");
        Shepherd shepherd = new Shepherd(4, "Brown");
        Haskey haskey = new Haskey(4, "White");

        switch(choice){
            case 1:
                bird.movement();
                bird.getDetails();
                break;
            case 2:
                turtle.movement();
                turtle.getDetails();
                break;
            case 3:
                shepherd.movement();
                shepherd.getDetails();
                break;
            case 4:
                haskey.movement();
                haskey.getDetails();
                break;
            default:
                break;

        }

    }
}
