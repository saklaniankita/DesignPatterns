package com.example.creational.singleton;

public class Client {
    private static EagerSingleton singleton1 = EagerSingleton.getInstance();
    private static EagerSingleton singleton2 = EagerSingleton.getInstance();

    private static LazySingleton lazySingleton1 = LazySingleton.getInstance();
    private static LazySingleton lazySingleton2 = LazySingleton.getInstance();


    public static void main(String[] args) {
        System.out.println(singleton1 == singleton2);
        System.out.println(lazySingleton1 == lazySingleton2);
    }

}
