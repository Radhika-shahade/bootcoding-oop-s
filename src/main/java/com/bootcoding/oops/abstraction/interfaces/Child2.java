package com.bootcoding.oops.abstraction.interfaces;

public class Child2 implements IParent{
    @Override
    public void purchase(double amount) {
        System.out.println("I am child 2: i will buy DairyMilk!");
    }
}
