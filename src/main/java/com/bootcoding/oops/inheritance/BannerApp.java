package com.bootcoding.oops.inheritance;

public class BannerApp {
    public static void main(String[] args) {
        FlexBanner fb= new FlexBanner();
        fb.matter="New Java batches are going to start!";
       fb.type= "Flex Banner";
        fb.create();
        fb.price = 100;
        fb.print2();
    }



}
