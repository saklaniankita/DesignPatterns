package com.example.creational.builder;

public class Client {
    public static void main(String[] args) {
        Car basicCar = new Car.CarBuilder("white", "Electric").build();
        Car carWithSeats = new Car.CarBuilder("Red", "Gas").seats(4).build();
        Car carWithSunroof = new Car.CarBuilder("Red", "Electric").hasSunRoof(true).build();
        Car carWithSunroofAndNavigation = new Car.CarBuilder("white", "Gas")
                .hasSunRoof(true)
                .hasNavigation(true).build();

        System.out.println("Basic Car: "+basicCar);
        System.out.println("carWithSeats: "+carWithSeats);
        System.out.println("carWithSunroof: "+carWithSunroof);
        System.out.println("carWithSunroofAndNavigation: "+carWithSunroofAndNavigation);


    }
}
