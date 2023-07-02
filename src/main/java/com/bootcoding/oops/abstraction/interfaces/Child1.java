package com.bootcoding.oops.abstraction.interfaces;

public class Child1 implements IParent{
    @Override
    public void purchase(double amount) {
        System.out.println("i am child1: i will buy kitkat!");
    }
}
