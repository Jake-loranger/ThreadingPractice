package com.example.Models;

public   class Vechicle {
    public boolean speed = false; 
    public String currentDirection = "north";
    public String intendedDirection = "north";
    public int timeStopped = 0;

    public void setSpeed(boolean speed) {
        this.speed = speed;
    }
    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }
    public void setIntendedDirection(String intendedDirection) {
        this.intendedDirection = intendedDirection;
    }
    public void setTimeStopped(int timeStopped) {
        this.timeStopped = timeStopped;
    }

    
}
