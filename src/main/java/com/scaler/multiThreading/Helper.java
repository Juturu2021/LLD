package com.scaler.multiThreading;

public class Helper {
    public static void doSomething(){
        System.out.println("doSomething printed By : " + Thread.currentThread().getName());
    }
}
