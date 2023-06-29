package com.bootcoding.oops.collection.arraylist.service.number.service;

import com.bootcoding.oops.collection.arraylist.service.number.model.Number;

public class PalindromeService {
    public void palindrome(Number number){
        int org = number.getNum();
        int rem = 0;
        while(org != 0){
            rem = rem * 10 + org % 10;
            org = org / 10;
        }
        if(rem == number.getNum()){
            number.setPalindrome("PALINDROME");
        }else{
            number.setPalindrome("NOT PALINDROME");
        }
    }
}
