package com.bootcoding.oops.abstraction.chocolate;

public abstract class Parent {
    public abstract void purchase(double amount);

    public String message;

    public void print() { // declare + implementation
        System.out.println("Parent Says: ");
        System.out.println(message);

    }
}
