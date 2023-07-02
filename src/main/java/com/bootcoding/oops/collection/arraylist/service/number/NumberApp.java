package com.bootcoding.oops.collection.arraylist.service.number;

import com.bootcoding.oops.collection.arraylist.service.number.model.Number;
import com.bootcoding.oops.collection.arraylist.service.number.service.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NumberApp {
    public static void main(String[] args) throws IOException {
        NumberService ns = new NumberService();
        EvenOddService eos = new EvenOddService();
        PalindromeService ps = new PalindromeService();
        PrimeNumberService pns = new PrimeNumberService();
        ArmstrongService ans= new ArmstrongService();
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Users\\Radhika shahade\\Number.csv"));
        ArrayList<Number> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
           Number randomNumber = ns.getRandomNumber();
            eos.evenOrOdd(randomNumber);
            pns.primeNumber(randomNumber);
            ps.palindrome(randomNumber);
            ans.armstrong(randomNumber);
            numbers.add(randomNumber);

        }

        for(Number number : numbers) {
            writer.write(number.toString());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }
    }

