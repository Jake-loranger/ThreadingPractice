package com.example;

import com.example.Models.TrafficLight;
import com.example.Models.Vechicle;

import java.util.Timer;
import java.util.TimerTask;

public class App 
{
    public static void main( String[] args )
    {

        // Need to use synchronzie to share the car object with each thread
        Vechicle car = new Vechicle();

        final TrafficLight north = new TrafficLight("north");
        final TrafficLight south = new TrafficLight("south");
        final TrafficLight east = new TrafficLight("east");
        final TrafficLight west = new TrafficLight("west");

        north.start();
        east.start();
        west.start();
        south.start();

        north.status = true;
        south.status = true;
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                north.toggleStatus();
                south.toggleStatus();
                east.toggleStatus();
                west.toggleStatus();

                System.err.println("\n light switch \n");
            }
        }, 0, 5000);

    }
}