package com.phua.singleton;

import java.util.UUID;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    public String id;

    private ThreadSafeSingleton() {

        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }

    /* The easier way to create a thread-safe singleton class is to make the global access method synchronized,
    so that only one thread can execute this method at a time. General implementation of this approach is
    like the below class. This implementation works fine and provides thread-safety but it reduces the
    performance because of cost associated with the synchronized method, although we need it only for the first
    few threads who might create the separate instances. */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /* To avoid extra overhead every time, double checked locking principle is used. In this approach, the
    synchronized block is used inside the if condition with an additional check to ensure that only one instance
    of singleton class is created. */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
