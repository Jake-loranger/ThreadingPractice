package com.example.Models;

public class TrafficLight extends Thread {
    public String direction;
    public boolean status;
    public Vechicle car;

    public TrafficLight (String direction) {
        this.direction = direction;
    }
    
    public synchronized void toggleStatus() {
        status = !status;
    }

    public synchronized void setStatus(boolean status) {
        this.status = status;
    }

    public synchronized boolean getStatus() {
        return status;
    }

    @Override
    public void run() {

        // Vechicle Behavior here

            while (true) {
                if (status) {
                    System.out.println(direction + " light is green");
                } else {
                    System.out.println(direction + " light is red");
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
