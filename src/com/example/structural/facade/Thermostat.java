package com.example.structural.facade;

public class Thermostat {

    public void setTemperature(int temperature) {
        System.out.println("Setting the room temperature to " + temperature + "°C.");
    }

    public void turnOff() {
        System.out.println("Turning off the Thermostat");
    }
}
