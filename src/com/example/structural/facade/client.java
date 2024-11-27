package com.example.structural.facade;

public class client {
    public static void main(String[] args) {
        SecuritySystem garageSystem = new SecuritySystem();
        Thermostat thermostat = new Thermostat();
        LightSystem lightSystem = new LightSystem();
        HomeTheatre homeTheatre = new HomeTheatre();

        HomeAutomationFacade facade = new HomeAutomationFacade(garageSystem,thermostat,lightSystem,homeTheatre);

        facade.enteringHouse();
        facade.movieNight();
    }
}
