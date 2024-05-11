package com.example.Models;

public class TrafficLight extends Thread {
    public String direction;
    public boolean status;
    public Vechicle car;

    @Override
    public void run() {

            while (true) {
                if (status) {
                    if (direction == "north") {
                        System.out.println("north light is on");
                    } else if (direction == "south") {
                        System.out.println("south light is on");
                    } else if (direction == "west") {
                        System.out.println("west light is on");
                    } else if (direction == "east") {
                        System.out.println("east light is on");
                    }
                } else {
                    if (direction == "north") {
                        System.out.println("north light is off");
                    } else if (direction == "south") {
                        System.out.println("south light is off");
                    } else if (direction == "west") {
                        System.out.println("west light is off");
                    } else if (direction == "east") {
                        System.out.println("east light is off");
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
