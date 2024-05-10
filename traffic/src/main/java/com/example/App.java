package com.example;

public class App implements Runnable
{
    public static void main( String[] args )
    {
        String[] directions = {"north", "south", "east", "west"};

        for (String direction: directions) {
            App app = new App();
            Thread thread = new Thread(app);
        }
        

    }

    public void run() {

    }
}
