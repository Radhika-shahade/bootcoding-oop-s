//package com.bootcoding.oops.collection.hashmap.number;
//
//import java.util.*;
//
//public class NumberService {
//    public ArrayList<Number> getRecords(int size) {
//        ArrayList<Number> numbers = new ArrayList<Number>();
//        for (int i = 0; i < size; i++) {
//            Number record = buildRecord();
//            numbers.add(record);
//
//        }
//        return numbers;
//    }
//    public Number buildRecord()
//    {
//        Number num= new Number();
//        num.setNumber(getRandomNumber());
//        return num;
//    }
//
////    public Map<String, Integer> checkingEvenOrOdd(List<Number>num)
////    {
////        Map<String,Integer>data= new HashMap<String, Integer>();
////        for(Number number:num)
////        if(number.getNumber()%2==0)
////        {
////            data.put("even number",number.getNumber());
////        }else
////        {
////            data.put("odd number",number.getNumber());
////        }
////        return data;
////    }
//
//    public int getRandomNumber()
//    {
//        Random random= new Random();
//        int min=20;
//        int max=40;
//        int number =random.nextInt(max - min);
//        return number;
//    }
//
//
//}
