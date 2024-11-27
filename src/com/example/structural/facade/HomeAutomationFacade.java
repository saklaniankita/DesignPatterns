package com.example.structural.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeAutomationFacade {
    private SecuritySystem securitySystem;
    private Thermostat thermostat;
    private LightSystem lightSystem;
    private HomeTheatre homeTheatre;

    //Preparing house when entering
   public void enteringHouse(){
       System.out.println("Preparing house to enter.......");
       securitySystem.arm();
       thermostat.setTemperature(28);
       lightSystem.on();
   }

   //preparing house when leaving
   public void leavingHouse(){
       System.out.println("Preparing house for leaving......");
       lightSystem.off();
       thermostat.turnOff();
       homeTheatre.stopMusic();
       homeTheatre.turnOffTV();
   }

   public void movieNight(){
       System.out.println("preparing house for a movie night......");
       securitySystem.disarm();
       lightSystem.dim();
       thermostat.setTemperature(25);
       homeTheatre.turnOnTV();
       homeTheatre.playMusic();
   }
}
