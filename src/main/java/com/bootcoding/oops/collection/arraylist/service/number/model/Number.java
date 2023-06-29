package com.bootcoding.oops.collection.arraylist.service.number.model;

public class Number {
  private int num;
  private String even;
  private String odd;
  private String primeNumber;
  private String palindrome;
  private String armstrong;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEven() {
        return even;
    }

    public void setEven(String even) {
        this.even = even;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public String getPrimeNumber() {
        return primeNumber;
    }

    public void setPrimeNumber(String primeNumber) {
        this.primeNumber = primeNumber;
    }

    public String getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(String palindrome) {
        this.palindrome = palindrome;
    }

    public String getArmstrong() {
        return armstrong;
    }

    public void setArmstrong(String armstrong) {
        this.armstrong = armstrong;
    }

    @Override
    public String toString() {
        return num+ ","+ even +","+palindrome+","+armstrong+","+primeNumber;
    }


//    @Override
//    public String toString() {
//        return "Number{" +
//                "num=" + num +
//                ", even='" + even + '\'' +
//                ", odd='" + odd + '\'' +
//                ", primeNumber='" + primeNumber + '\'' +
//                ", palindrome='" + palindrome + '\'' +
//                ", armstrong='" + armstrong + '\'' +
//                '}';
//    }
}
