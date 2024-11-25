package com.example.creational.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Car {
    //Required parameters
    private String color;
    private String engine;

    //optional parameters
    private int seats;
    private boolean hasNavigation;
    private boolean hasSunRoof;

    //private constructor to not be accessible from outside
    private Car(CarBuilder carBuilder){
        this.color = carBuilder.color;
        this.engine = carBuilder.engine;;
        this.seats = carBuilder.seats;
        this.hasNavigation = carBuilder.hasNavigation;
        this.hasSunRoof = carBuilder.hasSunRoof;
    }

    //inner static class
    public static class CarBuilder{
        private String color;
        private String engine;
        private int seats;
        private boolean hasNavigation;
        private boolean hasSunRoof;

        public CarBuilder(String color, String engine){
            this.color = color;
            this.engine = engine;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder hasNavigation(boolean hasNavigation) {
            this.hasNavigation = hasNavigation;
            return this;
        }

        public CarBuilder hasSunRoof(boolean hasSunRoof) {
            this.hasSunRoof = hasSunRoof;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

}
