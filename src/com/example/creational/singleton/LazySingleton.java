package com.example.creational.singleton;

/**
 *Go for lazy initialization for multithreaded environment
 * We make the instance volatile so that it is picked up from the main memory and not from the cache
 * we have made the default constructor private to avoid class instantiation using new keyword
 * We perform double null check
 * And create synchronized block for multithreaded environment
 * we can use Singleton pattern in Loggers, DatabaseConnection, etc
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton;


     private LazySingleton(){
     }

     public static LazySingleton getInstance(){
         if(lazySingleton == null){
             synchronized (LazySingleton.class){
                 if(lazySingleton == null)
                    lazySingleton = new LazySingleton();
             }
         }
         return lazySingleton;
     }

}
