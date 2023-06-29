package com.bootcoding.oops.collection.arraylist.service.number.service;

import com.bootcoding.oops.collection.arraylist.service.number.model.Number;

public class EvenOddService {
    public void evenOrOdd(Number num) {
        if(num.getNum() % 2 == 0){
           num.setEven("EVEN");
        }else{
           num.setEven("ODD");
        }

    }
}
