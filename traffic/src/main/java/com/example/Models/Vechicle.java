package com.example.Models;


public class Vechicle {
    public boolean speed; 
    public String currentDirection;
    public String intendedDirection;

    public void printVechicle (Vechicle car) {
        System.out.println("Car: \n" + "Direction: " + currentDirection +  "\nIntended Direction: " + intendedDirection);
    }
    
}
