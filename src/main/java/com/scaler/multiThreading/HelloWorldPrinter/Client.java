package com.scaler.multiThreading.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World printed by : " + Thread.currentThread().getName());
        //1. create a task object
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        //2. create a thread
        //3. assign task to the thread
        Thread thread = new Thread(helloWorldPrinter);

        //4. start the thread
        thread.start();

        System.out.println("Hello World printed by : " + Thread.currentThread().getName());

    }
}
