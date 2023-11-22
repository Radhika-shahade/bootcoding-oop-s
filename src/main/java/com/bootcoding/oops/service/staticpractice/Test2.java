package com.bootcoding.oops.service.staticpractice;

public class Test2 {
    static int a;
    public static void findSquare (int x)
    {
   int square = x*x;
        System.out.println(square);
    }
    public void findCube(int y)
    {
        findSquare(3);
       int cube= y*y*y;
        System.out.println(cube);
    }

    public static void main(String[] args) {
        Test2 obj= new Test2();
       findSquare(3);
       obj.findCube(4);

    }




}
