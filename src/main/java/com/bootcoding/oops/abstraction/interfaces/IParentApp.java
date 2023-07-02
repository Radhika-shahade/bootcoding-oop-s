package com.bootcoding.oops.abstraction.interfaces;

public class IParentApp {
    public static void main(String[] args) {
        Child1 ch1= new Child1();
        Child2 ch2= new Child2();
        Child3 ch3= new Child3();
        ch1.purchase(20.0);
        ch2.purchase(23.4);
        ch3.purchase(22.4);
    }
}
