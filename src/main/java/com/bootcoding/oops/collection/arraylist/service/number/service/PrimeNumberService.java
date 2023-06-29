package com.bootcoding.oops.collection.arraylist.service.number.service;


import com.bootcoding.oops.collection.arraylist.service.number.model.Number;

public class PrimeNumberService {

    public void primeNumber(Number number)
    {
        for(int i=2;i< number.getNum()/2; i++)
        {
            if(number.getNum()%i == 0)
            {
              number.setPrimeNumber("not prime number");
                return;
            }

        }
      number.setPrimeNumber("Prime Number");

    }

}
