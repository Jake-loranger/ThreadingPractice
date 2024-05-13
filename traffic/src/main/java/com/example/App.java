package com.example;

import com.example.Models.TrafficLight;
import com.example.Models.Vechicle;

import java.util.Timer;
import java.util.TimerTask;

public class App 
{
    public static void main( String[] args )
    {
        final TrafficLight north = new TrafficLight("north");
        final TrafficLight south = new TrafficLight("south");
        final TrafficLight east = new TrafficLight("east");
        final TrafficLight west = new TrafficLight("west");

        north.setStatus(true);
        south.setStatus(true);

        north.start();
        east.start();
        west.start();
        south.start();
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                north.toggleStatus();
                south.toggleStatus();
                east.toggleStatus();
                west.toggleStatus();

                System.err.println("\nLight switch:");
                System.err.println("North light has " + north.cars.size() + " in line.");
                System.err.println("South light has " + south.cars.size() + " in line.");
                System.err.println("East light has " + east.cars.size() + " in line.");
                System.err.println("West light has " + west.cars.size() + " in line.\n");
            }
        }, 0, 5000);

    }
}