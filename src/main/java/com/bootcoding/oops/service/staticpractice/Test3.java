package com.bootcoding.oops.service.staticpractice;

public class Test3 {
    int price;
    static String name;
    public void show()
    {
        System.out.println(price+ ":" +name);
    }
    public static void show1(Test3 obj1)
    {
        System.out.println(obj1.price+":"+ name);
    }

    public static void main(String[] args) {
        Test3 obj1= new Test3();
        obj1.price=454545;
        name="dsaf";
        show1(obj1);

    }
}
