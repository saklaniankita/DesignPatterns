package com.example.creational.singleton;

/**
 * Go for eager initialization for single threaded environment
 * Runtime class in Java uses Eager Singleton design pattern
 * Eager singleton may add up to your application startup time
 */
public class EagerSingleton {

    private EagerSingleton(){

    }

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getInstance(){

        return eagerSingleton;
    }
}
