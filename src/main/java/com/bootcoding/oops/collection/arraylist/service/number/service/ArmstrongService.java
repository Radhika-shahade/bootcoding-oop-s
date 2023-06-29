package com.bootcoding.oops.collection.arraylist.service.number.service;

import com.bootcoding.oops.collection.arraylist.service.number.model.Number;

public class ArmstrongService {
    public void armstrong(Number number) {
            int org= number.getNum();
            int res=0;
            int sum=0;
            while(org!=0)
            {
                res=org%10;
                sum=sum+res*res*res;
                org=org/10;
            }

            if(number.getNum()==sum)
            {
              number.setArmstrong("Armstrong Number");
            }
            else {
               number.setPrimeNumber("Not an Armstrong Number");
            }

        }

    }

