package com.scaler.multiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello : " + Thread.currentThread().getName());
        Helper.doSomething();

        /*
            Print a statement from a new thread
            1. create a Task that you want to execute in a separate thread
            2. Create a new Thread
            3. Assign the task to the thread/worker
            4. Start the thread
        */
    }
}
