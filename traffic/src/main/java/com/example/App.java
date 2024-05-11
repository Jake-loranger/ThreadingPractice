package com.example;

import com.example.Models.TrafficLight;
import com.example.Models.Vechicle;

public class App 
{
    public static void main( String[] args )
    {

        // Need to use synchronzie to share the car object with each thread
        Vechicle car = new Vechicle();

        TrafficLight north = new TrafficLight();
        TrafficLight south = new TrafficLight();
        TrafficLight east = new TrafficLight();
        TrafficLight west = new TrafficLight();
    
        north.direction = "north";
        north.status = true; 

        south.direction = "south";
        south.status = false; 

        west.direction = "west";
        west.status = false; 

        east.direction = "east";
        east.status = false; 

        north.start();
        east.start();
        west.start();
        south.start();

        east.status = true;
        north.status = false;


    }
}