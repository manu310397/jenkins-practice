package com.manoj.greet;

public class Greeter {
    public Greeter() {

    }

    public String greet(String someone) {
        return String.format("Hello, %s!", someone);
    }

    public static void main(String args[]){
        System.out.println("Hello from Main Method!!!");
    }
}
