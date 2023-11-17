package com.bootcoding.oops.inheritance;

public class FlexBanner extends Banner {
    double price;
    FlexBanner(){
        System.out.println("FlexBanner object is created");
    }
    public void print2()
    {
        System.out.println("Before - ");
        super.print();
        super.price = this.price;
        System.out.println("After - ");
        super.print();
    }
}
