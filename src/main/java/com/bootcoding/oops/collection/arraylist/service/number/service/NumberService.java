package com.bootcoding.oops.collection.arraylist.service.number.service;

import com.bootcoding.oops.collection.arraylist.service.number.model.Number;

import java.util.Random;

public class NumberService {
    // to get random number
    public Number getRandomNumber(){
        Random random = new Random();
        int n = random.nextInt();
      Number number= new Number();
        number.setNum(n);
        return number;
    }

}
