package com.example.Models;

import java.util.ArrayList;
import java.util.Random;

public class TrafficLight extends Thread {
    public String direction;
    public boolean status;
    public ArrayList<Vechicle> cars = new ArrayList<Vechicle>();

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

    public ArrayList<Vechicle> newCarArrival(ArrayList<Vechicle> cars) {
        Vechicle newCar = new Vechicle();
        String[] intendedDirections = {"straight", "left", "right"};
        
        int randomIndex = new Random().nextInt(intendedDirections.length); 

        newCar.intendedDirection = intendedDirections[randomIndex];
        newCar.currentDirection = direction;
        newCar.speed = false;

        cars.add(newCar);
        return cars;
    }

    public ArrayList<Vechicle> carDepartures(ArrayList<Vechicle> cars) {
        if (cars.size() >= 1) {
            if (cars.get(0).intendedDirection == "straight") {
                System.out.println("Car is going straight through the " + direction + " light");
                cars.remove(0);
            } else if (cars.get(0).intendedDirection == "right") {
                System.out.println("Car is going right through the " + direction + " light");
                cars.remove(0);
            } else if (cars.get(0).intendedDirection == "left") {
                System.out.println("Car is going left through the " + direction + " light");
                cars.remove(0);
            }
        }
        
        return cars;
    }

    @Override
    public void run() {

            while (true) {
                // Randomizes car arrivals
                int randInt = new Random().nextInt(2);
                if (randInt == 1) {
                    newCarArrival(cars);
                }

                if (status) {
                    carDepartures(cars);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                
            }
        }
    }
