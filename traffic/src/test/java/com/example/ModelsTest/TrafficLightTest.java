package com.example.ModelsTest;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import com.example.Models.TrafficLight;
import com.example.Models.Vechicle;


public class TrafficLightTest {

    @Test 
    public void testTrafficLightThread() {
        TrafficLight testTrafficLight = new TrafficLight("north");

        testTrafficLight.start();

        assertTrue(testTrafficLight.isAlive());
    }

    @Test 
    public void testCarDeparture() {
        TrafficLight testTrafficLight = new TrafficLight("north");
        Vechicle car = new Vechicle();

        car.currentDirection = "north";
        car.intendedDirection = "straight";
        car.speed = false;

        ArrayList<Vechicle> cars = new ArrayList<Vechicle>();
        cars.add(car);

        cars = testTrafficLight.carDepartures(cars);

        assertTrue(cars.isEmpty());
    }

    @Test 
    public void testCarArrival() {
        TrafficLight testTrafficLight = new TrafficLight("north");
        ArrayList<Vechicle> cars = new ArrayList<Vechicle>();
        
        cars = testTrafficLight.newCarArrival(cars);

        assertTrue(cars.size() == 1);
    }
    
}

