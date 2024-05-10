# ThreadingPractice
 
## Problem Statement

The task is to develop a multi-threaded program that simulates a traffic intersection. Each road leading to the intersection is represented by a thread. The goal is to manage the traffic flow through the intersection safely and efficentily, avoiding collisions between vechicles. You'll need to implment mechanisms for coordinating the flow of traffic, with stop signs, yield signs, and thraffic lights, using threading techniques to enssure smooth operation and prevent dealoacks or race conditions. 


## Assumptions

- Four way intersection
- Cars can turn right on red after a stop 
- Cars can turn left on green only after a stop
- Cars cannot move if the light is red
- No yellow lights

## Approach

- Four threads (East, West, North, South)
- When one thread is green the opposite is green as well and the other two are red
- Green lights last for 5 seconds
- Stops last for 1 second
- Each Traffic thread has a direction, status, and vechicle object

## Models
- Vechicle Model:
  - Speed
    - Stop
    - Go
  - Current Direction
    - North
    - East
    - West
    - South
  - Intended Direction
    - North
    - East
    - West
    - South
  - Time Stopped

- Traffic Stop Modal: 
  - Status
    - Red
    - Green 
  - Direction 
    - North
    - East 
    - West 
    - South
  - Vechicle Object

## Steps

1. Create Four Threads (East, West, North, South) with the status, direction, and vechicle object
2. Create a Vechicle model